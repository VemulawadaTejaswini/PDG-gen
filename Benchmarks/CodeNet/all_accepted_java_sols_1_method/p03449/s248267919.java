import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A1[] = new int[N];
		int A2[] = new int[N];
		for(int i = 0; i < N; i++) {
			A1[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			A2[i] = sc.nextInt();
		}
		
		int sum_A1[] = new int[N];
		int sum_A2[] = new int[N];
		sum_A1[0] = A1[0];
		for(int i = 1; i < N; i++) {
			sum_A1[i] = sum_A1[i - 1] + A1[i];
		}
		sum_A2[N - 1] = A2[N - 1];
		for(int i = N - 2; i >= 0; i--) {
			sum_A2[i] = sum_A2[i + 1] + A2[i];
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			ans = Math.max(ans, sum_A1[i] + sum_A2[i]);
		}
		System.out.println(ans);
	}
}
