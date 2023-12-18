import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		
		String S = "#abcdefghijklmnopqrstuvwxyz";
		String[] s = S.split("");
		
		StringBuffer ans = new StringBuffer("");
		
		while(N != 0) {
			int j = N%26;
			N = N/26;
			ans.append(s[j]);
		}
		
		System.out.print(ans.reverse());
		keyboard.close();	
	}
}
