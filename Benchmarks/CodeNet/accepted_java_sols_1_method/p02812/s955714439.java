
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		char[] s_chars = s.toCharArray();
		
		int cnt = 0;
		for(int i = 0;i < n-2;i++){
		    if(s_chars[i] == 'A'){
		        if(s_chars[i+1]=='B' && s_chars[i+2]== 'C'){
		            cnt++;
		        }
		    }
		}
		
		System.out.println(cnt);
		
      
	}
}
