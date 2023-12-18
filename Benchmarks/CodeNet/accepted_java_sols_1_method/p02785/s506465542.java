import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// モンスターの体力をPriorityQueueに格納
		PriorityQueue<Long> H = new PriorityQueue<> (Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			H.offer(sc.nextLong());
		}
		
		// N <= Kの場合は終了
		if (N <= K) {
			System.out.println(0);
			sc.close();
			return;
		}

		// 大きいものから順にK回取り出す
		for (int i = 0; i < K; i++) {
			H.poll();
		}
		
		// 結果の出力
		long sum = 0;
		while (H.size() > 0) {
			sum += H.poll();
		}
		System.out.println(sum);
		
		sc.close();
	}
}
