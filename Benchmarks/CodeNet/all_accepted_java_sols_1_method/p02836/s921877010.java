import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int nam = s.length();
		char[] s_chars = s.toCharArray();
		
		int nam2 = nam/2;
		int cnt = 0;
		for(int i = 0;i<nam2;i++){
		    if(s_chars[i] != s_chars[nam-i-1]){
		        cnt++;
		    }
		}
       
       System.out.print(cnt);
      
	}
}