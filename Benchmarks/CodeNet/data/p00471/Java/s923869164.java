import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Reindeer with no sense of direction
public class Main{

	class R{
		int id, S;
		public R(int id, int s) {
			this.id = id;
			S = s;
		}
	}

	int n, NS, c;
	List<R>[] l;
	Map<Integer, Integer>[] mem;

	int dfs(int k, int S){
//		System.out.println("C:"+(c++));
//		System.out.println("k:"+k+" S:"+S);
		if(mem[k].containsKey(S))return mem[k].get(S);
		if(k==n){
			return S==(1<<(n+1))-1?1:0;
		}
		if(S!=(1<<n)-1&&(S&NS)==NS)return 0;
		int res = 0;
		for(R r:l[k]){
			if((r.S&S)==0)res += dfs(r.id, S+(1<<r.id));
		}
		mem[k].put(S, res);
		return res;
	}

	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int w = sc.nextInt(), h = sc.nextInt();
			if((h|w)==0)break;
			int[][] map = new int[h][w];
			n = 0;
			int si = 0, sj = 0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				map[i][j] = sc.nextInt();
				if(map[i][j]==0)map[i][j]=-1;
				else if(map[i][j]==1)map[i][j]=n++;
				else {
					si = i; sj = j;
				}
			}
			map[si][sj] = n;
			NS = 0;
			for(int k=0;k<4;k++){
				int pi = si, pj = sj;
				for(;;){
					pi += d[k][0]; pj += d[k][1];
					if(0<=pi&&pi<h&&0<=pj&&pj<w){
						if(map[pi][pj]!=-1){
							NS += 1<<map[pi][pj]; break;
						}
					}
					else break;
				}
			}
//			debug(map);
//			System.out.println("NS:"+NS);
			l = new List[n+1];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				if(map[i][j]==-1)continue;
				int x = map[i][j];
				l[x] = new ArrayList<R>();
				for(int k=0;k<4;k++){
					int pi = i, pj = j, S = 0;
					for(;;){
						pi += d[k][0]; pj += d[k][1];
						if(0<=pi&&pi<h&&0<=pj&&pj<w){
							int nx = map[pi][pj];
							if(0<=nx&&nx<n)S+=1<<nx;
							if(nx!=-1)l[x].add(new R(nx, S));
						}
						else break;
					}
				}
//				System.out.println("ID:"+x+" L:"+l[x].size());
//				for(R r:l[x]){
//					System.out.println("Next:"+r.id+" S:"+r.S);
//				}
			}
			mem = new Map[n+1];
			for(int i=0;i<=n;i++)mem[i] = new HashMap<Integer, Integer>();
			int res = 0;
//			c = 0;
			for(R r:l[n]){
//				System.out.println("RID:"+r.id);
				res += dfs(r.id, 1<<r.id);
			}
			System.out.println(res);
		}
	}

	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}