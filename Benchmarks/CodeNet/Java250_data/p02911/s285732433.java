import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// N, P, Qの入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		
		// 各自の得点を格納する配列
		int[] points = new int[N];
		
		// 各自に最初の持ち点を付与（あらかじめQを引いておく）
		Arrays.fill(points, K-Q);
		
		// 正解者にポイントを加算
		for (int i = 0; i < Q; i++) {
			points[sc.nextInt()-1]++;
		}
		
		// 結果を出力
		for (int i = 0; i < N; i++) {
			if (points[i] > 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
