import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long N  = keyboard.nextLong();
		
		String S = "abcdefghijklmnopqrstuvwxyz";
		String[] s = S.split("");
		
		StringBuffer ans = new StringBuffer("");
		
		while(N > 0) {
			int j = (int)((N-1)%26);
			N = (N-1)/26;
			ans.append(s[j]);
		}
		
		System.out.print(ans.reverse());
		keyboard.close();	
	}
}
