import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long N = keyboard.nextLong();
		int K = keyboard.nextInt();
		int ans = 0;
		
		while(N > 0) {
			N /= K;
			ans++;
		}
			
		System.out.println(ans);
		keyboard.close();	
	}
}