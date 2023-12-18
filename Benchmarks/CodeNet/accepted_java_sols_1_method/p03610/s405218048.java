import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
        int a = s.length();
		char[] s_chars = s.toCharArray();
      
      for(int i = 1; i <= a ;i++){
        if(i%2!=0){
		System.out.print(s_chars[i-1]);
        }
      }

	}
}
