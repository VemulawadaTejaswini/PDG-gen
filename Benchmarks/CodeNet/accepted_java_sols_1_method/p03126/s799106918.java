import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cnt = new int[M];
		for(int i = 0; i < N; i++) {
			int K = sc.nextInt();
			for(int j = 0; j < K; j++) {
				int A = sc.nextInt() - 1;
				cnt[A]++;
			}
		}
		int k = 0;
		for(int i : cnt) {
			if(i == N) {
				k++;
			}
		}
		System.out.println(k);
	}
}