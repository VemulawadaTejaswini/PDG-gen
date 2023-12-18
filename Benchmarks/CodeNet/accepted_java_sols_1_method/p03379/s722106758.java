import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X[] = new long[N];
		long Y[] = new long[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = X[i];
		}
		Arrays.sort(Y);
		long center = Y[N / 2];
		for(int i = 0; i < N; i++) {
			if(X[i] < center) {
				System.out.println(center);
			} else {
				System.out.println(Y[(N / 2) - 1]);
			}
		}
	}
}
