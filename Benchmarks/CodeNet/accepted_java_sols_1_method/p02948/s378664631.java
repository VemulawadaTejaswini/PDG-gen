import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		// 入力行数 <= 1E5 → buff使うと実行時間半減した
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		
		// 遅延日数ごとに仕事をグルーピング
		@SuppressWarnings("unchecked") ArrayList<Integer>[] jobs = new ArrayList[m + 1]; 
		for ( int i = 0; i <= m; i++ ) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(0); // ダミー要素
			jobs[i] = a;
		}
		for ( int i = 0; i < n; i++ ) {
			inputs = br.readLine().split(" ");
			int d = Integer.parseInt(inputs[0]);
			int f = Integer.parseInt(inputs[1]);
			if ( d > m ) continue; // 遅延日数的に候補になりえない仕事は除外
			jobs[d].add(f);
		}

		long earn = 0;		
		PriorityQueue<Integer> jobPool = new PriorityQueue<Integer>(Collections.reverseOrder());

		// m日目をゼロとして考え後退していく days:残り日数
		for ( int thatDay = 0; thatDay <= m; thatDay++ ) {
			jobPool.addAll(jobs[thatDay]);
			earn += (long) jobPool.poll();
		}

		System.out.println(earn);
		br.close();
	}
}