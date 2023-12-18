import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] map = new int[h][w];
		int[][] ck  = new int[h][w];
		boolean[][] cc = new boolean[h][w];
		for(int i = 0; i < h; i++) {
			char[] mm = sc.next().toCharArray();
			for(int j = 0; j < w; j++) {
				if(mm[j] == '.') continue;
				map[i][j] = mm[j] - '0';
			}
		}
		ArrayDeque<Node> q = new ArrayDeque<Node>();
		ArrayDeque<Node> n_q = new ArrayDeque<Node>();
		int[] vx = {1,1,1,0,0,-1,-1,-1};
		int[] vy = {1,0,-1,1,-1,1,0,-1};
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] == 0) {
					for(int k = 0; k < 8; k++) {
						int ty = i + vy[k];
						int tx = j + vx[k];
						if(r(h,w,ty,tx) && map[ty][tx] != 0) {
							cc[ty][tx] = true;
							ck[ty][tx]++;
						}
					}
				}
			}
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(cc[i][j]) {
					q.add(new Node(i,j));
				}
			}
		}
		
		boolean o = true;
		int ans = 0;
		ArrayDeque<Node> er = new ArrayDeque<Node>();
		while(o) {
			o = false;
			while(!q.isEmpty()) {
				Node n = q.poll();
				if(map[n.h][n.w] == 0) continue;
				
				if(ck[n.h][n.w] >= map[n.h][n.w]) {
					o = true;
					er.add(n);
					for(int i = 0; i < 8; i++) {
						int tx = n.w + vx[i];
						int ty = n.h + vy[i];
						if(r(h,w,ty,tx) && map[ty][tx] != 0 && !cc[ty][tx]) {
							n_q.add(new Node(ty,tx));
							cc[ty][tx] = true;
						}
					}
				} else {
					cc[n.h][n.w] = false;
				}
				
			}
			while(!er.isEmpty()) {
				Node p = er.poll();
				for(int i = 0; i < 8; i++) {
					int tx = p.w + vx[i];
					int ty = p.h + vy[i];
					if(r(h,w,ty,tx) && map[ty][tx] != 0) {
						ck[ty][tx]++;
						if(!cc[ty][tx]) {
							n_q.add(new Node(ty,tx));
							cc[ty][tx] = true;
						}
					}
				}
				map[p.h][p.w] = 0;
			}
			ArrayDeque<Node> tmp = q;
			q = n_q;
			n_q = tmp;
			if(o) ans++;
		}
		System.out.println(ans);
		
	}
	
	static boolean r(int a, int b, int c, int d) {
		if(c < 0 || d < 0 || c >= a || d >= b) return false;
		return true;
	}
	
	static class Node {
		int h;
		int w;
		Node(int a, int b) {
			h = a;
			w = b;
		}
	}
}