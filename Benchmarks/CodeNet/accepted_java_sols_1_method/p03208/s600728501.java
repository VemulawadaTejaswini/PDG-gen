import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N + 1];
		h[0] = 0;
		
		for(int i = 1; i <= N; i++) {
			h[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
		
		int hmax = 0;
		int hmin = 0;
		double min = Math.pow(10, 10);
		
		for(int i = 1; i <= (N - K + 1); i++) {
			min = Math.min(h[i + K - 1] - h[i], min);
		}
		
		System.out.println((int)min);
		
	}
}
