
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] h = new long[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);
//		System.out.println(Arrays.toString(h));
		
		long diff = 10000000000L;
		int start = 0;
		long d = 0;
		while(start + K <= N) {
			d = h[start+K-1] - h[start];
			if( d < diff ) {
				diff = d;
			}
			start++;
		}
		
		System.out.println(diff);
		

		sc.close();
	}
}
