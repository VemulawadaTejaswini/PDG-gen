import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long[] h = new long[N];
		
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextLong();
		}
		
		Arrays.sort(h);
		long min = 1000000000;
		
		for(int i = K - 1; i < N; i++) {
			min = Math.min(h[i] - h[i - (K - 1)], min);
		}
		System.out.println(min);
		
	}
}
