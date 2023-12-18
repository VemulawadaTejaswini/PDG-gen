import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;

			Point start = null;
			map = new char[h][w];

			for(int i=0;i<h;i++){
				map[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(map[i][j] == '#'){
						start = new Point(j,i);
						map[i][j] = 'w';
					}
				}
			}

			op = sc.next().toCharArray();

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			State ans = null;
			open.add(new State(start,0,0,0));

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.idx == 6){
					ans = st;
					break;
				}

				open.addAll(st.nexts());
			}

			System.out.println(ans==null ? "unreachable" : ans.cost);
		}
	}

	private static int w,h;
	private static char[][] map;
	private static char[] op;
	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {-1,0,1,0};

	private static String[] ds = {
		"rcybgm",
		"ybcrgm",
		"crbygm",
		"byrcgm",
		"mgybrc",
		"ybgmrc",
		"gmbyrc",
		"bymgrc",
		"crybmg",
		"ybrcmg",
		"rcbymg",
		"bycrmg",
		"gmybcr",
		"ybmgcr",
		"mgbycr",
		"bygmcr",
		"rcmgyb",
		"mgcryb",
		"crgmyb",
		"gmrcyb",
		"bymgrc",
		"mgybrc",
		"ybgmrc",
		"gmbyrc",
		"crmgby",
		"mgrcby",
		"rcgmby",
		"gmcrby",
		"ybmgcr",
		"mgbycr",
		"bygmcr",
		"gmybcr",
		"rcbymg",
		"bycrmg",
		"crybmg",
		"ybrcmg",
		"gmbyrc",
		"bymgrc",
		"mgybrc",
		"ybgmrc",
		"crbygm",
		"byrcgm",
		"rcybgm",
		"ybcrgm",
		"mgbycr",
		"bygmcr",
		"gmybcr",
		"ybmgcr",
		"rcgmby",
		"gmcrby",
		"crmgby",
		"mgrcby",
		"ybgmrc",
		"gmbyrc",
		"bymgrc",
		"mgybrc",
		"crgmyb",
		"gmrcyb",
		"rcmgyb",
		"mgcryb",
		"bygmcr",
		"gmybcr",
		"ybmgcr",
		"mgbycr",
	};

	private static int[][] dd = {
		{4,1,12,3},
		{17,2,27,0},
		{14,3,6,1},
		{25,0,19,2},
		{8,5,0,7},
		{18,6,26,4},
		{2,7,10,5},
		{24,4,16,6},
		{12,9,4,11},
		{19,10,25,8},
		{6,11,14,9},
		{27,8,17,10},
		{0,13,8,15},
		{16,14,24,12},
		{10,15,2,13},
		{26,12,18,14},
		{7,17,13,19},
		{11,18,1,16},
		{15,19,5,17},
		{3,16,9,18},
		{24,4,16,6},
		{8,5,0,7},
		{18,6,26,4},
		{2,7,10,5},
		{13,25,7,27},
		{9,26,3,24},
		{5,27,15,25},
		{1,24,11,26},
		{16,14,24,12},
		{10,15,2,13},
		{26,12,18,14},
		{0,13,8,15},
		{6,11,14,9},
		{27,8,17,10},
		{12,9,4,11},
		{19,10,25,8},
		{2,7,10,5},
		{24,4,16,6},
		{8,5,0,7},
		{18,6,26,4},
		{14,3,6,1},
		{25,0,19,2},
		{4,1,12,3},
		{17,2,27,0},
		{10,15,2,13},
		{26,12,18,14},
		{0,13,8,15},
		{16,14,24,12},
		{5,27,15,25},
		{1,24,11,26},
		{13,25,7,27},
		{9,26,3,24},
		{18,6,26,4},
		{2,7,10,5},
		{24,4,16,6},
		{8,5,0,7},
		{15,19,5,17},
		{3,16,9,18},
		{7,17,13,19},
		{11,18,1,16},
		{26,12,18,14},
		{0,13,8,15},
		{16,14,24,12},
		{10,15,2,13},
	};

	private static class State implements Comparable<State>{
		Point p;
		int cost,idx;
		int d;

		State(Point p,int cost,int idx,int d){
			this.p = new Point(p.x,p.y);
			this.cost = cost;
			this.idx = idx;
			this.d = d;
		}

		List<State> nexts(){
			List<State> sts = new ArrayList<State>();
			for(int i=0;i<4;i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				int nd = dd[d][i];

				if(nx>=0 && nx<w && ny>=0 && ny<h && (map[ny][nx]=='w' || map[ny][nx]==op[idx] && op[idx]==ds[nd].charAt(0))){
					int nidx = idx;
					if(map[ny][nx]==op[idx] && op[idx] == ds[nd].charAt(0)) nidx++;

					sts.add(new State(new Point(nx,ny),cost+1,nidx,nd));
				}
			}
			return sts;
		}

		public int compareTo(State st){
			return cost - st.cost;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return st.p.equals(p) && st.idx == idx && ds[st.d].equals(ds[d]);
		}

		public int hashCode(){
			return p.x + p.y * 100 + idx * 10000 + ds[d].hashCode();
		}
	}
}