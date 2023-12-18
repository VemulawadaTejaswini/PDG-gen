package number_0201_0207_0223;
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0223
	static class StrayTwins {
		void print_minTime() {
			for(;;) {
				int w = sc.nextInt(), h = sc.nextInt();
				if(w == 0 && h == 0) break;
				int stx = sc.nextInt()-1, sty = sc.nextInt()-1,
					skx = sc.nextInt()-1, sky = sc.nextInt()-1;
				int[][] field = new int[h][w];
				boolean[][][][] marker = new boolean[h][w][h][w];
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {field[i][j] = sc.nextInt();}
				}

				Queue<TwinsPoint> que = new LinkedList<TwinsPoint>();
				que.offer(new TwinsPoint(sty,stx,sky,skx,0));
				marker[sty][stx][sky][skx] = true;

				int[] dir_ty = {-1, 0, 1, 0}, dir_tx = { 0, 1, 0,-1},
					  dir_ky = { 1, 0,-1, 0}, dir_kx = { 0,-1, 0, 1};
				int ans = -1;
				while(!que.isEmpty()) {
					TwinsPoint pt = que.poll();
					if(pt.time == 100) break;
					if(pt.ty == pt.ky && pt.tx == pt.kx) {
						ans = pt.time;
						break;
					}
					for(int i=0; i<4; i++) {
						int nty = pt.ty + dir_ty[i], ntx = pt.tx + dir_tx[i],
							nky = pt.ky + dir_ky[i], nkx = pt.kx + dir_kx[i];
						TwinsPoint npt = new TwinsPoint(pt.ty, pt.tx, pt.ky, pt.kx, pt.time);
						npt.time++;
						if(nty >= 0 && ntx >= 0 && nty < h && ntx < w && field[nty][ntx] != 1) {
							npt.ty = nty; npt.tx = ntx;
						}
						if(nky >= 0 && nkx >= 0 && nky < h && nkx < w && field[nky][nkx] != 1) {
							npt.ky = nky; npt.kx = nkx;
						}
						if(!marker[npt.ty][npt.tx][npt.ky][npt.kx]) {
							marker[npt.ty][npt.tx][npt.ky][npt.kx] = true;
							que.offer(npt);
						}
					}
				}
				if(ans == -1) System.out.println("NA");
				else System.out.println(ans);
			}
		}
	}

	static class TwinsPoint {
		public int ty, tx, ky, kx, time;
		public TwinsPoint(int ty, int tx, int ky, int kx, int time) {
			this.ty = ty; this.tx = tx;
			this.ky = ky; this.kx = kx;
			this.time = time;
		}
	}

	public static void main(String[] args) {
		StrayTwins st = new StrayTwins();
		st.print_minTime();
	}
}