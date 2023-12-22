import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        HashMap<Character,String> ep =new HashMap<Character,String>();
        HashMap<String,Character> dp =new HashMap<String,Character>();

		ep.put(' ', "101");
		ep.put('\'', "000000");
		ep.put(',', "000011");
		ep.put('-', "10010001");
		ep.put('.', "010001");
		ep.put('?', "000001");
		ep.put('A', "100101");
		ep.put('B', "10011010");
		ep.put('C', "0101");
		ep.put('D', "0001");
		ep.put('E', "110");
		ep.put('F', "01001");
		ep.put('G', "10011011");
		ep.put('H', "010000");
		ep.put('I', "0111");
		ep.put('J', "10011000");
		ep.put('K', "0110");
		ep.put('L', "00100");
		ep.put('M', "10011001");
		ep.put('N', "10011110");
		ep.put('O', "00101");
		ep.put('P', "111");
		ep.put('Q', "10011111");
		ep.put('R', "1000");
		ep.put('S', "00110");
		ep.put('T', "00111");
		ep.put('U', "10011100");
		ep.put('V', "10011101");
		ep.put('W', "000010");
		ep.put('X', "10010010");
		ep.put('Y', "10010011");
		ep.put('Z', "10010000");
        
		dp.put("00000", 'A');
		dp.put("00001", 'B');
		dp.put("00010", 'C');
		dp.put("00011", 'D');
		dp.put("00100", 'E');
		dp.put("00101", 'F');
		dp.put("00110", 'G');
		dp.put("00111", 'H');
		dp.put("01000", 'I');
		dp.put("01001", 'J');
		dp.put("01010", 'K');
		dp.put("01011", 'L');
		dp.put("01100", 'M');
		dp.put("01101", 'N');
		dp.put("01110", 'O');
		dp.put("01111", 'P');
		dp.put("10000", 'Q');
		dp.put("10001", 'R');
		dp.put("10010", 'S');
		dp.put("10011", 'T');
		dp.put("10100", 'U');
		dp.put("10101", 'V');
		dp.put("10110", 'W');
		dp.put("10111", 'X');
		dp.put("11000", 'Y');
		dp.put("11001", 'Z');
		dp.put("11010", ' ');
		dp.put("11011", '.');
		dp.put("11100", ',');
		dp.put("11101", '-');
		dp.put("11110", '\'');
		dp.put("11111", '?');
        
        while(scan.hasNext()){
        	char [] line= scan.nextLine().toCharArray();
        	StringBuilder tmp=new StringBuilder();
        	for(char c:line)
        		tmp.append(ep.get(c));
        //	System.out.println(tmp);
        	while(tmp.length()%5!=0)tmp.append('0');
     
        	String splitedCode =tmp.toString();
        	StringBuilder sb = new StringBuilder();
        	for(int i=0;i<splitedCode.length();i+=5)
        		sb.append(dp.get(splitedCode.substring(i,i+5)));
        	System.out.println(sb);
        }
    }
}