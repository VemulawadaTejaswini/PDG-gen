import java.util.*;

public class Main {
	static final long MOD = 998244353;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int x1 = sc.nextInt()-1;
		int y1 = sc.nextInt()-1;
		int x2 = sc.nextInt()-1;
		int y2 = sc.nextInt()-1;

		char[][] m = new char[H][];
		for(int i=0; i<H; i++)
			m[i] = sc.next().toCharArray();

		long[][][] best = new long[H][W][4];
		for(int i=0; i<H; i++)
			for(int j=0; j<W; j++)
				Arrays.fill(best[i], Long.MAX_VALUE);
		
		for(int i=0; i<4; i++)
			best[y1][x1][i] = 0;
		
		final int[] dx = {0, 1, 0, -1};
		final int[] dy = {1, 0, -1, 0};
		
		LinkedList<Long> q = new LinkedList<>();
		final long MASK1 = (1l<<40)-1;
		final long MASK2 = (1l<<20)-1;
		
		for(int d=0; d<4; d++) {
			long v = (d<<40)|(y1*W+x1);
			q.add(v);
		}
		
		while(!q.isEmpty()) {
			Long cur = q.poll();
			int dir = (int)((cur>>60)&3);
			Long step = (cur>>20)&MASK1;
			int y = (int)((cur&MASK2)/W);
			int x = (int)((cur&MASK2)%W);
			
			if(best[y][x][dir]<=step)
				continue;
			
			for(int d=0; d<4; d++) {
				int ny = y + dy[d];
				int nx = x + dx[d];
				if(0<=ny && ny<H && 0<=nx && nx<W &&m[ny][nx]=='.') {
					long nextStep = step;
					if(d==dir && (step&MASK1)<K) {
						nextStep++;
					} else {
						nextStep = (((step>>20)+1)<<20)+1;
					}
					if(best[ny][nx][dir]<=nextStep)
						continue;
					long v = d;
					v = (v<<40)|((nextStep>>20<<20)+1);
					v = (v<<20)|(ny*W+nx);
					q.add(v);
				}
			}
		}
		
		System.out.println(best[y2][x2]<Long.MAX_VALUE ? best[y2][x2] : -1);

		sc.close();
	}
}
