import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			char[][] map = new char[h+2][w+2];
			int gx = -1;
			int gy = -1;
			for(int i=0;i<h+2;i++) Arrays.fill(map[i], '.');
			for(int i=0;i<h;i++){
				char[] c = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					map[i+1][j+1] = c[j];
					if(c[j]=='&'){
						gx = j+1;
						gy = i+1;
					}
				}
			}
			
			int[][] cnt = new int[h+2][w+2];
			for(int i=0;i<h;i++) Arrays.fill(cnt[i], Integer.MAX_VALUE);
			
			int[] a = new int[]{0,0,1,-1};
			int[] b = new int[]{1,-1,0,0};
			ArrayDeque<Integer> x = new ArrayDeque<Integer>();
			ArrayDeque<Integer> y = new ArrayDeque<Integer>();
			x.offer(0);
			y.offer(0);
			cnt[0][0] = 0;
			int p, q, r;
			while(x.size()!=0){
				p = x.poll();
				q = y.poll();
				for(int i=0;i<4;i++){
					int u = p+a[i];
					int v = q+b[i];
					if(0<=u && u<w+2 && 0<=v && v<h+2){
						if(map[q][p]=='#' && map[v][u]!='#') r = 1;
						else r = 0;
						if(cnt[v][u] > cnt[q][p] + r){
							x.offer(u);
							y.offer(v);
							cnt[v][u] = cnt[q][p] + r;
						}
					}
				}
			}
			System.out.println(cnt[gy][gx]);
		}	
	}	
}