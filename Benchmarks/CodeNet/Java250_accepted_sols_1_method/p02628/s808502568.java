import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		PriorityQueue<Integer> P = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			P.add(sc.nextInt());
		}
		
		// 結果の出力
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += P.poll();
		}
		System.out.println(sum);
		
		sc.close();
	}
}
