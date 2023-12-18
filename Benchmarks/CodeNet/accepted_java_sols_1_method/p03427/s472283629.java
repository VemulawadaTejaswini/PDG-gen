import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
		String s = "" + (sc.nextLong() + 1);
        
//        桁数を求める（c99..99）
        
//        for(int i=0; i<s.length(); i++){
        int i = 0;
        int ans = s.charAt(i) - '1' + (s.length() -1) * 9 ;

//        }
        System.out.println(ans);
        
    }
}