import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int[][] M;
		int[] visit;
		int sum=0, min,v,number=1;
		final int inf = Integer.MAX_VALUE;
		
		n = sc.nextInt();
		M = new int[n][n];
		for(int i=0; i<n; i++) { for(int j=0; j<n; j++) { M[i][j] = sc.nextInt(); } }
		
		//その頂点が訪問済みかどうかを示す配列、初期値は0, 訪問すると1になる
		visit = new int[n];
		//一番最初の頂点は訪問済みにしておく
		visit[0] = 1;
		//頂点の数だけ繰り返す（n回）
		while( true ) {
			min = inf;
			v = -1;
			
			//木の探索を行う
			for(int i=0; i<n; i++) {
				if(visit[i] == 1) {
					for(int j=0; j<n; j++) {
						if(visit[j]==0 && M[i][j]>=0 && M[i][j]<min) {
							min = M[i][j];
							v = j;
						}
					}	
				}
			}//木の探	索終了
			//訪問済みにする
			visit[v] = 1	;
			sum += min;
			number++;
			if(number == n) break;
		}//n個の頂点に対し	処理が終了
		
		System.out.println( sum );
	}
}

