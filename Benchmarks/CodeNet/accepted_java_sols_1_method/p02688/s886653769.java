import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				int a = sc.nextInt();
				A[a - 1]++;
			}
		}
		sc.close();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] == 0) ans++;
		}
		System.out.println(ans);
	}
}