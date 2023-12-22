import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		Arrays.fill(X, 0);
		for(int i = 0; i < N - 1; i++) {
			X[sc.nextInt() - 1]++;
		}

		for(int i = 0; i < N; i++) {
			System.out.println(X[i]);
		}
	}
}