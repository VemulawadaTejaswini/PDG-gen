import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//頂点の数
		int n = sc.nextInt();
		//定数（∞として扱う）
		final int inf = Integer.MAX_VALUE;
		//u:頂点の番号　k:出字数 v:隣接する頂点の番号 c:隣接する頂点への辺の重み
		int u, k, v, c;
		int min;
		//全て定数で初期化
		int[] d = new int[n];
		Arrays.fill(d, inf);
		//頂点を訪問したかを示す
		int[] visit = new int[n];
		int white = 0, gray = 1, black = 2;
		
		int[][] M = new int[n][n];
		for(int i=0; i<n; i++) { for(int j=0; j<n; j++) { M[i][j] = inf; } }
		
		for(int i=0; i<n; i++) {
			u = sc.nextInt();
			k = sc.nextInt();
			//出字数分だけ
			for(int j=0; j<k; j++) {
				v = sc.nextInt();
				c = sc.nextInt();
				M[u][v] = c;
			}
		}
		
		d[0] = 0;
		visit[0] = gray;
		while( true ) {
			min = inf;
			int indexU = -1;
			for(int i=0; i<n; i++) {
				if(min > d[i] && visit[i] != black) {
					indexU = i;
					min = d[i];
				}
			}
			if(indexU == -1) break;
			visit[indexU] = black; //訪問済みに変更
			for(v=0; v<n; v++) {
				if(visit[v]!=black && M[indexU][v]!=inf) {
					if(d[v] > d[indexU] + M[indexU][v]) {
						d[v] = d[indexU] + M[indexU][v];
						visit[v] = gray;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(d[i] == inf) { System.out.println(i+" "+-1); }
			else { System.out.println(i+" "+d[i]); }
		}
	}
}

