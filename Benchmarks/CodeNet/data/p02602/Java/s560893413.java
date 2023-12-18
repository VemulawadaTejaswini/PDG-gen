import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		long[] AA = new long[N];
		
		for(int n=0; n<N; n++) {
		long A = keyboard.nextLong();
			if(n == 0) {
				AA[n] = A;
			}else {
				AA[n] = AA[n-1]*A; 
			}
		}
		
		String[] ans = new String[N];
		Arrays.fill(ans, "No");
		
		for(int n = K; n<N; n++) {
			if(n > K) {
				if(AA[n]/AA[n-K] > AA[n-1]/AA[n-1-K]) {
				ans[n] = "Yes";
				}
			}else{
				if(AA[n]/AA[n-K] > AA[n-1]) {
					ans[n] = "Yes";
				}
			}
		}
		for(int i = K; i<N; i++) {
			System.out.println(ans[i]);
		}
		keyboard.close();
	}
}