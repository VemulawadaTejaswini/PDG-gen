
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 7;
	int MAXL = 50;
	int h, w, n;
	char[][] map;
	Unknown[] unknowns;

	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(;t>0;t--) {
			h = sc.nextInt();
			w = sc.nextInt();
			if( (h|w) == 0 ) break;
			
			map = new char[h][w];
			unknowns = new Unknown[MAX];
			n = 0;
			for(int i=0;i<h;i++) {
				String str = sc.next();
				for(int j=0;j<w;j++) {
					map[i][j] = str.charAt(j);
					if( map[i][j] != '.' ) {
						char c = map[i][j];
						for(int k=0;k<n;k++) {
							if( c == unknowns[k].c) {
								c = '#';
								unknowns[k].set(j, i);
								break;
							}
						}
						if( c != '#' ) {
							unknowns[n] = new Unknown(c);
							unknowns[n++].set(j,i);
						}
					}
				}
			}
			
			System.out.println( (isRect()? "SAFE": "SUSPICIOUS") );
		}
	}
	
	boolean isRect() {
		HashMap<Character, Integer> char2int = new HashMap<Character, Integer>();
		for(int i=0;i<n;i++) {
			char2int.put(unknowns[i].c, i);
			for(int x=unknowns[i].minx;x<=unknowns[i].maxx;x++)
			for(int y=unknowns[i].miny;y<=unknowns[i].maxy;y++) {
				if(map[y][x] == '.') {
					return false;
				}
				if(unknowns[i].c != map[y][x]) unknowns[i].on(map[y][x]);
			}		
		}
		
		for(int i=0;i<n;i++) {
			boolean[] visited = new boolean[n];
			LinkedList<Integer> que = new LinkedList<Integer>();
			for(char c: unknowns[i].on) que.add(char2int.get(c));
			while(!que.isEmpty()) {
				int now = que.removeFirst();
//				debug(i, now);
				if(now == i) return false;
				for(char c: unknowns[now].on) if(!visited[char2int.get(c)]){
					visited[char2int.get(c)] = true;
					que.add(char2int.get(c));
				}
			}
		}
		
		return true;
	}
	
	class Unknown {
		char c;
		int minx, miny, maxx, maxy;
		HashSet<Character> on;
		Unknown(char c) {
			on = new HashSet<Character>();
			minx = miny = MAXL;
			maxx = maxy = 0;
			this.c = c;
		}
		void set(int x, int y) {
			minx = min(minx, x);
			miny = min(miny, y);
			maxx = max(maxx, x);
			maxy = max(maxy, y);
		}
		void on(char c) {
			on.add(c);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}