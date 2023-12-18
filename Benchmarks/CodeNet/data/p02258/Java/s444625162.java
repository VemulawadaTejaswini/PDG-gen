import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long max_profit = -999999999;
		
		int N = sc.nextInt();
		long[] R = new long[N];
		for (int i = 0; i < N; i++) {
			R[i] = sc.nextLong();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				long tmp = R[j] - R[i];
				max_profit = Math.max(max_profit, tmp);
			}
		}
		
		System.out.println(max_profit);
	}
}