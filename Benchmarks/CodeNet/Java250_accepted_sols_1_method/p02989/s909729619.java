import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		int min = X[N / 2 - 1];
		int max = X[N / 2];
		
		System.out.println(max-min);
	}
}