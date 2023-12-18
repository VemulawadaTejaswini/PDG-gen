import java.util.*;
public class Main{

	/**
	 * @param args
	 */
	static int N,M,P,A,B;
	static int[][] map;
	static int[] tickets;
	static double[][] d;
	static final int INF = (1<< 20);
	static double res = INF;
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			N = sc.nextInt();
			M = sc.nextInt();
			P = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			if(N == 0) break;
			map = new int[M][M];
			tickets = new int[N];
			for(int i = 0;i<N;i++){
				tickets[i] = sc.nextInt();
			}
			d = new double[M][(1 << N)];
			for(int i = 0;i<M;i++){
				Arrays.fill(d[i], INF);
			}
			for(int i = 0;i<P;i++){
				int s = sc.nextInt();
				int dest = sc.nextInt();
				int c = sc.nextInt();
				map[s-1][dest-1] = c;
				map[dest-1][s-1] = c;
			}
			d[A-1][0] = 0;
			solve();
			System.out.println(res == INF ? "Impossible" : res);
		}
	}
	static double solve(){
		res = INF;
		for(int su = 0;su<M;su++){
			for(int st = 0;st<(1<<N);st++){
				res = Math.min(res,d[B-1][st]);
				for(int du = 0;du<M;du++){
					for(int t = 0;t<N;t++){
						if((st & (1<<t)) == 0 && map[su][du] != 0){
							int dt = st | (1<<t);
							d[du][dt] = Math.min(d[du][dt], d[su][st] + (double)map[du][su] / (double)tickets[t]);
						}
					}
				}
			}
		}
		return res;
	}

}