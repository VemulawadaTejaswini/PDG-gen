import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int[] R = new int[N];
		for (int i = 0; i < N; i++) {
			R[i] = sc.nextInt();
		}
		
		// 消費する体力の総和の計算
		PriorityQueue<Integer> pq = new PriorityQueue<> ();
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {
				sum += Math.pow(R[j]-i, 2);
			}
			pq.add(sum);
		}
		
		// 結果の出力
		System.out.println(pq.poll());

		sc.close();
	}
}
