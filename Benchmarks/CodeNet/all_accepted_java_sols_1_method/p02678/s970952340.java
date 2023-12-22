import java.util.*;
import java.util.function.BiConsumer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		
		
		//部屋を結ぶ道をリストで管理
		List<Integer>[] edge = new ArrayList[N];
		for(int i = 0; i < N; i++)
		    edge[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    edge[a].add(b);
		    edge[b].add(a);
		}

		int INF = 100000000;
		Queue<Integer> queue = new ArrayDeque<>(); //空のキューの用意
		int[] shirube = new int[N];
		//訪問済み&道標
		Arrays.fill(shirube, INF);

		//頂点vが未訪問のとき、訪問済みにしてvをキューに追加する
		//BiConsumer<T, V>は関数型
		//"->"はラムダ記法
		BiConsumer<Integer, Integer> push = (v, d) -> { 
			if (! (shirube[v]==INF)) return; //ノードに訪問済みの時は、関数を終了する

			/* 訪問済みにする操作を記述 */
			shirube[v] = d;
			queue.add(v);
		};
		//初期ノードを訪問
		push.accept(0, 0);

		//キューが空になるまで、キューから取り出し頂点と接続した頂点を訪問
		//訪問済みの場合は、push関数側が何もせずに終了する
		while(!queue.isEmpty()) {
			int v = queue.poll(); //キューから頂点取り出す

			/* 隣接する頂点にに対してpush関数を適用する　*/
			for(int i : edge[v]) {
				if(shirube[i]==INF) {
					shirube[i] = v+1;
					queue.add(i);
				}
			}

		}

		System.out.println("Yes");
		for(int i = 1; i < N; i++) {
			System.out.println(shirube[i]);
		}
		
	}
}
