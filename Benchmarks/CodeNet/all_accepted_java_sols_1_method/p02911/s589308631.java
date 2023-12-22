import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int a[] = new int[Q];

		for (int i = 0; i < Q; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[N];

		Arrays.fill(b, K - Q);
		for (int i = 0; i < Q; i++) {
			b[a[i] - 1]++;
		}
		for (int i = 0; i < N; i++) {
			System.out.println(b[i] <= 0 ? "No" : "Yes");
		}
	}
}