import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ai = new int[100001];
		
		long sum = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			sum += a;
			ai[a] ++;
		}

		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			long add_or_sub = 0;
			ai[c] += ai[b];
			add_or_sub = c * ai[c] - b * ai[b];
			ai[b] = 0;
			
			System.out.println(sum + add_or_sub);
			sum += add_or_sub;
		}
	}
}
