import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//９頂点
		int M = sc.nextInt();//１３辺
		
		List<Integer>[] edge = new ArrayList[N];//９頂点
		
		for(int i = 0; i < N; i++)
		    edge[i] = new ArrayList<>();//リストにリストを入れている
		    
		for (int i = 0; i < M; i++) {//辺の情報を入れている１３
		    int a = sc.nextInt()-1;//-1でインデックスを調整している
		    int b = sc.nextInt()-1;
		    edge[a].add(b);//各頂点から何処の頂点に繋がっているかの情報を入れている
		    edge[b].add(a);
		}
		int[] ans = new int[N];//頂点の数分の配列9
		Arrays.fill(ans, -1);
		
		Queue<Integer> s = new ArrayDeque<>();//[  ]
		ans[0] = 0;
		s.offer(0);//０をセット
		
		while(s.size() > 0) {
			int x = s.poll();//キューの先頭を取得して削除する
			for(int i : edge[x]) {//リストの中に入っている繋がっている頂点の数分回す拡張なので中の頂点の値
				if(ans[i] != -1) continue;//指定した頂点にまだ到達していなければ
				
					//ans[i] = x+1;//0 + 1
					ans[i] = ans[x] + 1;//0 + 1現在地の原点からのステップ＋１をしている
					s.add(i);//キューに１が追加される				
				
			}
		}
		System.out.println("Yes");
		for(int i = 1; i < N; i++)
			System.out.println(ans[i]);//[1][2][3]
	}

}
