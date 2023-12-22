import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] X = new long[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextLong();
		}
		long x1 = 0;
		for(int i = 0; i < N; i++) {
			x1 += ((i%2 == 0)?X[i]:-X[i]);
		}
		System.out.print(x1);
		for(int i = 0; i < N - 1; i++) {
			x1 = X[i] * 2 - x1;
			System.out.print(" "+x1);
		}
		System.out.println();
	}
}