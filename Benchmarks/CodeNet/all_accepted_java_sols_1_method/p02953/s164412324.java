import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		long[] H = new long[N];
		
		for(int i=0; i<N; i++) {
			H[i] = keyboard.nextLong();
		}
		
		for(int n=0; n<N; n++) {
			if(n==0) {
				H[n]--;
			}
			else if(H[n]-H[n-1]>=1) {
				H[n]--;
			}
		}
		
		String ans = "Yes";
		for (int i=0; i<N-1; i++) {
			if (H[i] > H[i+1]) {
				ans = "No";
			}
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
