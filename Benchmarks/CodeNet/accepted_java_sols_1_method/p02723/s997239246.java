import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		char[] s_chars = s.toCharArray();
		
		if(s_chars[2] == s_chars[3] && s_chars[4] == s_chars[5]){
		        System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
      
	}
}
