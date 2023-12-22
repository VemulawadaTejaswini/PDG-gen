import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), K = sc.nextLong();
		long[] H = new long[200005];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		Arrays.sort(H);
		long sum = 0;
		if(N > K) {
			for(int i = (int)(200005 - K - 1); i >= 200005 - N; i--) {
				sum += H[i];
			}
		}
		System.out.print(sum);
		
		sc.close();
		
	}
}
