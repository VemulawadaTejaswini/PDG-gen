import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int n;
	public static char[] table;
	public static Rect[] rect;
	public static char[][] map;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for(int t=0; t<test; t++){
			int h = in.nextInt();
			int w = in.nextInt();
//			if(h == 0) break;
			map = new char[h][w];
			int alps = 0;
			for(int i=0; i<h; i++){
				map[i] = in.next().toCharArray();
				for(int j=0; j<w; j++){
					if('A' <= map[i][j] && map[i][j] <= 'Z')
						alps |= 1<<map[i][j]-'A';
				}
			}
			n = Integer.bitCount(alps);
			table = new char[n];
			int idx = 0;
			for(int i=0; i<26; i++){
				if((alps&1<<i)==0) continue;
				table[idx++] = (char)('A'+i);
			}
			rect = new Rect[n];
			for(int i=0; i<n; i++){
				int left = w;
				int right = 0;
				int up = h;
				int down = 0;
				char c = table[i];
				for(int y=0; y<h; y++){
					for(int x=0; x<w; x++){
						if(map[y][x] != c) continue;
						left = Math.min(left, x);
						right = Math.max(right, x);
						up = Math.min(up, y);
						down = Math.max(down, y);
					}
				}
				rect[i] = new Rect(left, right, up, down);
			}
			p = new int[n];
			System.out.println(dfs(0, 0) ? "SAFE" : "SUSPICIOUS");
		}
	}
	
	public static int[] p;
	public static boolean dfs(int idx, int used){
		if(idx == n){
			if(check(p)) return true;
		}
		for(int i=0; i<n; i++){
			if((used&1<<i)>0) continue;
			p[idx] = i;
			if(dfs(idx+1, used|1<<i)) return true;
		}
		return false;
	}
	
	public static boolean check(int[] order){
		int used = 0;
		for(int i=0; i<n; i++){
			char c = table[order[i]];
			used |= 1<<c-'A';
			Rect r = rect[order[i]];
			for(int y=r.up; y<=r.down; y++){
				for(int x=r.left; x<=r.right; x++){
					char p = map[y][x];
					if(p == '.' || (used&1<<p-'A')==0)
						return false;
				}
			}
		}
		return true;
	}
}

class Rect{
	int left, right;
	int up, down;
	public Rect(int l, int r, int u, int d){
		left = l;
		right = r;
		up = u;
		down = d;
	}
}