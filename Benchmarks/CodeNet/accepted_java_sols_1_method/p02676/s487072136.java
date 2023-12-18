import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int K = keyboard.nextInt();
		String S = keyboard.next();
		String d = "...";
		
		if(S.length() > K) {
			S = S.substring(0,K);
			S += d;
		}
		
		System.out.print(S);
		keyboard.close();
	}
}
