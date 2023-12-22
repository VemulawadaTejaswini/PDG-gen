import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		long K = 1000000007;
		long ans = 1;
		
		for(int n=1; n<=N; n++) {
			ans = ans*n%K; 
		}	
		
		System.out.print(ans);
		keyboard.close();
	}
}