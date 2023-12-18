import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;

			char[][] map = new char[h][w];
			int sx = -1, sy = -1, gx = -1, gy = -1;
			for(int i=0;i<h;i++){
				map[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(map[i][j] == 'S'){
						sx = j;
						sy = i;
						map[i][j] = '.';
					}
					else if(map[i][j] == 'G'){
						gx = j;
						gy = i;
						map[i][j] = '.';
					}
				}
			}

			int first = -1;
			int ans = Integer.MAX_VALUE;
			for(int i=0;i<5;i++){
				int tmp = getMinCost(map,sx,sy,gx,gy,1<<i);
				if(ans > tmp){
					ans = tmp;
					first = i+1;
				}
			}

			if(first == -1) System.out.println("NA");
			else System.out.println(first + " " + ans);
		}
	}

	private static int getMinCost(char[][] map,int sx,int sy,int gx,int gy,int get){
		PriorityQueue<State> open = new PriorityQueue<State>();
		HashSet<State> closed = new HashSet<State>();
		open.add(new State(sx,sy,0,get));

		while(!open.isEmpty()){
			State st = open.poll();
			if(closed.contains(st)) continue;
			closed.add(st);

			if(st.x == gx && st.y == gy && st.get+1 == (1<<5)){
				return st.cost;
			}

			open.addAll(st.nexts(map));
		}

		return Integer.MAX_VALUE;
	}
}

class State implements Comparable<State>{
	int x,y,cost,get;

	State(int x,int y,int cost,int get){
		this.x = x;
		this.y = y;
		this.cost = cost;
		this.get = get;
	}

	List<State> nexts(char[][] map){
		List<State> sts = new ArrayList<State>();
		int dx[] = {-1,1,0,0};
		int dy[] = {0,0,1,-1};

		for(int i=0;i<4;i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx>=0 && nx<map[0].length && ny>=0 && ny<map.length){
				if(map[ny][nx] == '.'){
					sts.add(new State(nx,ny,cost+1,get));
				}
				else{
					int digit = map[ny][nx] - '1';
					boolean flg = ( get & (1 << ((digit + 4) % 5)) ) > 0 ? true : false;

					sts.add(new State(nx,ny,cost+1,flg ? (get|(1<<digit)) : get));
				}
			}
		}

		return sts;
	}

	public int compareTo(State st){
		return this.cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return x == st.x && y == st.y && get == st.get;
	}

	public int hashCode(){
		return x + y * 1000 + get * 1000000;
	}

	public String toString(){
		return String.format("[(%d,%d),%d,%s]",x,y,cost,Integer.toString(get,2));
	}
}