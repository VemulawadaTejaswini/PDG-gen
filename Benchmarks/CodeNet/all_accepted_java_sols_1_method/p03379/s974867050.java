import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] X = new long[N];
		long[] Y = new long[N];
		long[] Z = new long[N];
		
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextLong();
			Y[i] = X[i];
		}
		
		Arrays.sort(Y);
		long mid = Y[N / 2 - 1];
		
		for(int i = 0; i < N; i++) {
			if(X[i] > mid) {
				System.out.println(mid);
			} else {
				System.out.println(Y[N / 2]);
			}
		}
	}
}
