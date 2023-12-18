
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

class Main {

	/*
	 * https://onlinejudge.u-aizu.ac.jp/problems/ALDS1_11_C
	 */

	public static void main(String[] args) {
		//入力
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		boolean matrics[][] = new boolean[N][N];//要素の名前は0~N-1
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) matrics[i][j] = false;
		}
		for(int i=0; i<N; i++) {
			int index = Integer.parseInt(scanner.next())-1;
			int k = Integer.parseInt(scanner.next());
			for(int j=0; j<k; j++) {
				matrics[index][Integer.parseInt(scanner.next())-1] = true;
			}
		}
		scanner.close();

		//探索
		Queue<Integer> queue = new ArrayBlockingQueue<>(N);
		queue.add(0);//頂点１を探索対象に設定
		int depth = 0;
		String message[] = new String[N];//出力用配列
		//到達したかどうかを管理する配列
		boolean isReachable[] = new boolean[N];
		for(int i=0; i<N; i++) {
			isReachable[i] = false;
		}
		//深さごとに到達した点を覚えておく
		ArrayList<Integer> pointList = new ArrayList<>();
		//BFSをする
		for(;;) {
			int node = queue.poll();
			if(!isReachable[node]) {
				message[node] = String.format("%d %d", node+1, depth);//初めてキューから取り出される時だけ
				isReachable[node] = true;//キューから取り出した＝到達している
				pointList.add(node);//これも２行上と同じ
			}
			if(queue.isEmpty()) {
				//次の深さへ
				depth++;
				for(int j : pointList) {
					for(int i=0; i<N; i++) {
						if(matrics[j][i]) {
							if(!queue.contains(i)) {//これをしないと重複でN個を超える場合がある
								queue.add(i);
							}
						}
					}
				}
				pointList.clear();
			}
			if(queue.isEmpty()) break;
		}
		//到達したかどうかチェック
		for(int i=0; i<N; i++) {
			if(!isReachable[i]) {
				message[i] = String.format("%d %d", i+1, -1);
			}
		}

		//出力
		for(String s : message) {
			System.out.println(s);
		}

	}

}

