import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Reindeer with no sense of direction
public class Main{

	int w, h, n;
	int[][] map;
	int goal = 25;
	int[][] dp;
	int[][] id;
	Map<Integer, Integer>[] m;
	int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};

	int get(int i, int j, int s){
		int v = id[i][j];
//		System.out.println("I:" + i + " J:" + j + " S:" + s);
		if(s!=0&&v==goal){
			//			System.out.println("I:" + i + " J:" + j + " S:" + s + " RES: " + (s==(1<<n)-1?1:0));
			return 1;
		}
		if(v!=goal&&m[v].containsKey(s))return m[v].get(s);
		int res = 0;
		for(int k=0;k<4;k++){
//			System.out.println("K:" + k + " RES:" + res);
			int ni = i+move[k][0];
			int nj = j+move[k][1];
			while(0<=ni&&ni<h&&0<=nj&&nj<w){
				if(map[ni][nj]!=-1){
					int u = map[ni][nj];
					if(u==goal){
						if(s==(1<<n)-1)res++;
					}
					else{
						if((s&(1<<u))>0)break;
						res += get(ni, nj, s+(1<<u));
					}
				}
				ni += move[k][0];
				nj += move[k][1];
			}
		}
		m[v].put(s, res);
		return res;
	}

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h)==0)break;
			map = new int[h][w];
			id = new int[h][w];
			n = 0;
			int si, sj;
			si = sj = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j]==0)map[i][j] = -1;
					else if(map[i][j]==1){
						map[i][j] = n;
						id[i][j] = n++;
					}
					else {
						map[i][j] = goal;
						id[i][j] = goal;
						si = i;
						sj = j;
					}
				}
			}
			m = new HashMap[goal+1];
			for(int i=0;i<=goal;i++)m[i]=new HashMap<Integer, Integer>();
			System.out.println(get(si, sj, 0));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}