import java.util.*;
public class Main {
	public static void main(String[] args) {
		long INF = Long.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() , M = sc.nextInt(), L = sc.nextInt();
		long to[][] = new long[N][N];
		for(long tmp[]:to)Arrays.fill(tmp,INF);
		for(int i=0;i<M;i++) {
			int A = sc.nextInt()-1, B = sc.nextInt()-1;
			long C = sc.nextInt();
			if(C>L)C=INF;
			to[A][B]=to[B][A]=C;
		}
		int Q = sc.nextInt();
		int query[][] = new int[Q][2];
		for(int i=0;i<Q;i++) {
			int s = sc.nextInt()-1, t = sc.nextInt()-1;
			query[i][0]=s;
			query[i][1]=t;
		}
		sc.close();
		
		//最短距離がL以下なら、そこは1度で移動できる。
		//１度で移動できる場所をすべて、埋めてそれを元に全点対の移動回数配列を埋める。
		
		
		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					to[i][j]=Math.min(to[i][j], to[i][k]+to[k][j]);
				}
			}
		}
		
		long times[][] = new long[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(to[i][j]<=L)times[i][j]=1;
				else times[i][j]=INF;
			}
		}
		
		//最短移動回数を求める
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					times[i][j]=Math.min(times[i][j], times[i][k]+times[k][j]);
				}
			}
		}
	
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<Q;i++) {
			int start = query[i][0], goal = query[i][1];
			if(times[start][goal]==INF)sb.append(-1);
			else sb.append(times[start][goal] - 1);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
