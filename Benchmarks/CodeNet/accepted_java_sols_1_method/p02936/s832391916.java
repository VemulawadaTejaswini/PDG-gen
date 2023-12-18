import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		int a,b,p,x;
		int idx;

		// 親⇔子(双方向)リストのマップ
		HashMap<Integer, ArrayList<Integer>> pMap = new HashMap<Integer, ArrayList<Integer>>();
		// 値のマップ
		int[] value = new int[N+1];
		int[] counter = new int[N+1];

		ArrayList<Integer> childs;
		for (idx = 0; idx < N-1; idx++) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());

			// a-b
			childs = pMap.get(a);
			if (childs == null) {
				childs = new ArrayList<Integer>();
				pMap.put(a, childs);
			}
			childs.add(b);
			// b-a
			childs = pMap.get(b);
			if (childs == null) {
				childs = new ArrayList<Integer>();
				pMap.put(b, childs);
			}
			childs.add(a);
		}
		for (idx = 0; idx < Q; idx++) {
			p = Integer.parseInt(sc.next());
			x = Integer.parseInt(sc.next());
			counter[p] += x;
		}
		sc.close();

		// 処理するノード、親の1をスタート
		int[] nodes = new int[N];
		nodes[0] = 1;
		// 親フラグ
		boolean[] parentFlg = new boolean[N+1];
		for (idx = 1; idx <= N; idx++) {
			parentFlg[idx] = false;
		}

		int node;
		int pos = 0;
		int tailpos = 1;

		while(true) {
			node = nodes[pos++];
			// 親フラグ立てる
			parentFlg[node] = true;

			// 自身のカウンター足す
			value[node] += counter[node];
			// 子を取得
			childs = pMap.get(node);
			if (childs != null) {
				// 子に親の合計を足す
				for (int ch : childs) {
					if (!parentFlg[ch]) {
						// 親として処理済みでないもののみ足す
						value[ch] += value[node];
						nodes[tailpos++] = ch;
					}
				}
			}

			if (pos >= N) {
				break;
			}
		}

		for (idx = 1; idx < N+1; idx++) {
			System.out.print(value[idx] + " ");
		}

	}

}
