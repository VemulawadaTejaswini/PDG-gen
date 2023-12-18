import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HashMap<Character,String> map = new HashMap<Character,String>();
    map.put('A',"00000");
    map.put('B',"00001");
    map.put('C',"00010");
    map.put('D',"00011");
    map.put('E',"00100");
    map.put('F',"00101");
    map.put('G',"00110");
    map.put('H',"00111");
    map.put('I',"01000");
    map.put('J',"01001");
    map.put('K',"01010");
    map.put('L',"01011");
    map.put('M',"01100");
    map.put('N',"01101");
    map.put('O',"01110");
    map.put('P',"01111");
    map.put('Q',"10000");
    map.put('R',"10001");
    map.put('S',"10010");
    map.put('T',"10011");
    map.put('U',"10100");
    map.put('V',"10101");
    map.put('W',"10110");
    map.put('X',"10111");
    map.put('Y',"11000");
    map.put('Z',"11001");
    map.put(' ',"11010");
    map.put('.',"11011");
    map.put(',',"11100");
    map.put('-',"11101");
    map.put('\'',"11110");
    map.put('?',"11111");

    HashMap<String,Character> map2 = new HashMap<String,Character>();
    map2.put("100101",'A');
    map2.put("10011010",'B');
    map2.put("0101",'C');
    map2.put("0001",'D');
    map2.put("110",'E');
    map2.put("01001",'F');
    map2.put("10011011",'G');
    map2.put("010000",'H');
    map2.put("0111",'I');
    map2.put("10011000",'J');
    map2.put("0110",'K');
    map2.put("00100",'L');
    map2.put("10011001",'M');
    map2.put("10011110",'N');
    map2.put("00101",'O');
    map2.put("111",'P');
    map2.put("10011111",'Q');
    map2.put("1000",'R');
    map2.put("00110",'S');
    map2.put("00111",'T');
    map2.put("10011100",'U');
    map2.put("10011101",'V');
    map2.put("000010",'W');
    map2.put("10010010",'X');
    map2.put("10010011",'Y');
    map2.put("10010000",'Z');
    map2.put("101",' ');
    map2.put("000000",'\'');
    map2.put("000011",',');
    map2.put("10010001",'-');
    map2.put("010001",'.');

    while(sc.hasNext()){
      String s = sc.nextLine();
      String bit = "";

      for(char ch : s.toCharArray()){
        bit += map.get(ch);
      }

      int idx = 0;
      String ans = "";
      while(idx < bit.length()){
        boolean flg = false;
        for(String ss : map2.keySet()){
          if(bit.substring(idx).startsWith(ss)){
            ans += map2.get(ss);
            flg = true;
            idx += ss.length();
            continue;
          }
        }
        if(!flg) break;
      }

      System.out.println(ans);
    }
  }
}