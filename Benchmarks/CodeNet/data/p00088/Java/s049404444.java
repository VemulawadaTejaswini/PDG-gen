import java.util.*;

public class Main{
   Scanner in = new Scanner(System.in);

   String[] a = {
        " ", "101", "'", "000000", ",", "000011", "-", "10010001",
        ".", "010001", "?", "000001", "A", "100101", "B", "10011010",
        "C", "0101", "D", "0001", "E", "110", "F", "01001", "G", "10011011",
        "H", "010000", "I", "0111", "J", "10011000", "K", "0110",
        "L", "00100", "M", "10011001", "N", "10011110", "O", "00101",
        "P", "111", "Q", "1001111", "R", "1000", "S", "00110", "T", "00111",
        "U", "10011100", "V", "10011101", "W", "000010", "X", "10010010",
        "Y", "10010011", "Z", "10010000"};
    
    char[] b = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'Y', 'Z', ' ', '.', ',', '-', '\'', '?' 
    };
   void solve(){
       HashMap<Character, String> map = new HashMap<>();
       for(int i = 0; i < a.length; i += 2){
           map.put(a[i].charAt(0), a[i + 1]);
       }
       String s;
       while(in.hasNextLine()){
           s = in.nextLine();
           StringBuilder sb = new StringBuilder();
           for(char ch: s.toCharArray()){
               sb.append(map.get(new Character(ch)));
           }
           int x = 5 - sb.length()%5;
           for(int i = 0; i < x; i++){
               sb.append('0');
           }
           StringBuilder ans = new StringBuilder();
           String tmp = sb.toString();
           for(int i = 0; i < tmp.length(); i += 5){
                int idx = 0;
                String num = tmp.substring(i, i + 5);
                for(int j = 0; j < 5; j++){
                    idx *= 2;
                    idx += num.charAt(j) == '1' ? 1 : 0;
                }
                ans.append(b[idx]);
           }
           System.out.println(ans.toString());
       }
   }

   public static void main(String[] args){
       new Main().solve();    
   }
}