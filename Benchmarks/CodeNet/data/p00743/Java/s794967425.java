import java.util.Scanner;

public class Main {

	static int start, goal;				// スタート都市、ゴール都市
	static int n_city, m_road;		// 都市の数、道の数
	static int[][] road_dist;			// 道の距離情報
	static int[][] speed_limit;		// 道の制限速度情報
	static double[][][] city;			// ダイクストラ　最短時間保管表
	static boolean[][][] enter;		// ダイクストラ　最短時間確定
	static final int speed_law = 30;
	
	// ダイクストラアルゴリズム
	static double Dijkstra(){
		// 初期設定。最短時間をMAX値で初期化。
		city = new double[n_city+1][n_city+1][speed_law+1];
		enter = new boolean[n_city+1][n_city+1][speed_law+1];
		for(int i=0;i<=n_city;i++){
			for(int j=0;j<=n_city;j++){
				for(int k=0;k<=speed_law;k++){
					city[i][j][k] = Double.MAX_VALUE;
				}
			}
		}
		city[start][start][1] = 0;		// スタート→スタートで速度1の場合、所要時間0
		// ループアルゴ(状態遷移を次々と決める)
		// 	cf. 状態遷移とは「ある都市→ある都市の移動(速度も含む)」
		while(true){
			// 最短時間表から最も最短時間な状態遷移を探す
			double fast = Double.MAX_VALUE;
			int x, y, z;		// fastのindex
			x = y = z = -1;
			for(int i=1;i<=n_city;i++){
				for(int j=1;j<=n_city;j++){
					for(int k=1;k<=speed_law;k++){
						if(!enter[i][j][k]&&city[i][j][k]<fast){		// 確定されてない & 最短時間
							fast = city[i][j][k];
							x = i;	y = j;	z = k;		// 設定されるxはstartと同値が既知
						}
					}
				}
			}
			// 表において探した最も最短時間な状態遷移が、
			//		スタート→ゴールで速度が1の場合は解が得られる
			if(x==start&&y==goal&&z==1){
				return city[x][y][1];
			}
			// 最短時間の更新が一度もされない→状態遷移がすべて確定してしまった
			// 	(ゴールに辿りつける道がない or ゴール時に速度が1とならない)
			else if(x==-1){
				break;
			}
			enter[x][y][z] = true;		// 探した最短時間状態遷移を確定する
//			System.out.println("enter : x="+x+", y="+y+", z="+z+" time="+city[x][y][z]);
			// 確定した状態遷移から移動できる都市を更新しにいく (yからnexの移動)
			for(int nex=1;nex<=n_city;nex++){		// nex = 遷移先(次)
				// 速度3パターン(-1,0,1)、zは元の速度、spdは遷移時の速度
				for(int spd=z-1;spd<=z+1;spd++){
					// スピード負値、制限速度オーバー、道路がない　場合は除外
					if(spd<=0||spd>speed_limit[y][nex]||road_dist[y][nex]==Double.MAX_VALUE){
						continue;
					}
					// スタート地点から出る道とゴール地点に到達する道は必ず速度1 (この問題においての超重要点)
					// 	さらには今来た道(x->y y->nex(x) ... x=nex=start)
					if(((y==start||nex==goal)&&spd!=1)||start==nex){
//						System.out.println("s="+start+" g="+goal+" y="+y+" z="+z+" nex="+nex+" spd="+spd);
						continue;
					}
//					System.out.println("connect : y="+y+", nex="+nex+", spd="+spd);
					// 時間 = 距離 / 速度
					city[x][nex][spd] = Math.min(city[x][y][z] + road_dist[y][nex]*1.0/spd , city[x][nex][spd]);
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			n_city = stdIn.nextInt();
			m_road = stdIn.nextInt();
			if((n_city|m_road)==0){
				return;
			}
			start = stdIn.nextInt();
			goal = stdIn.nextInt();
			road_dist = new int[n_city+1][n_city+1];
			speed_limit = new int[n_city+1][n_city+1];
			for(int i=0;i<m_road;i++){
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				int d = stdIn.nextInt();
				int c = stdIn.nextInt();
				road_dist[x][y] = road_dist[y][x] = d;
				speed_limit[x][y] = speed_limit[y][x] = c;
			}
			double ans = Dijkstra();
			if(ans!=-1){
				System.out.printf("%.5f\n",ans);
			}
			else{
				System.out.println("unreachable");
			}
		}
	}
}