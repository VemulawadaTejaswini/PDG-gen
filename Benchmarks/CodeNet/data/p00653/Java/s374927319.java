import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE;
	
	static int W, H, WW, HH, segH, segW;
	static int[][] data;
	static int[][] segTree;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;){
			H = Integer.parseInt(in.next());
			W = Integer.parseInt(in.next());
			int Q = Integer.parseInt(in.next());
			
			if(H==0){
				return ;
			}
			
			data = new int[H][W];
			
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					data[i][j] = Integer.parseInt(in.next());
				}
			}
			
			int logH = H == 1 ? 0 : 31 - Integer.numberOfLeadingZeros(H-1),
				logW = W == 1 ? 0 : 31 - Integer.numberOfLeadingZeros(W-1);
			HH = 1<<(logH+1);
			WW = 1<<(logW+1);
			segH = 2*HH-1;
			segW = 2*WW-1;
			
			segTree = new int[segH][segW];
			
			initializeH(0,0,HH);
			
			for(int i=0; i<Q; i++){
				int y1 = Integer.parseInt(in.next());
				int x1 = Integer.parseInt(in.next());
				int y2 = Integer.parseInt(in.next());
				int x2 = Integer.parseInt(in.next());
				System.out.println(query(y1, x1, y2+1, x2+1));
			}
		}
	}

	static void initializeW(int y, int cur, int lx, int rx){
		if(rx - lx <= 1){
			if(y < H && lx < W){
				segTree[y+HH-1][cur] = data[y][lx];
			}
			return ;
		}
		
		int mid = (lx + rx) / 2;
		
		initializeW(y, 2*cur+1, lx, mid);
		initializeW(y, cur*2+2, mid, rx);
		
		segTree[y+HH-1][cur] = Math.min(segTree[y+HH-1][2*cur+1], segTree[y+HH-1][2*cur+2]);
	}
	
	static int queryW(int nodeY, int fx, int tx, int cur, int lx, int rx){
		if(rx <= fx || tx <= lx){
			return INF;
		}
		
		if(fx<=lx&&rx<=tx){
			return segTree[nodeY][cur];
		}
		
		int mid = (lx+rx)/2;
		return Math.min(queryW(nodeY, fx, tx, cur*2+1, lx, mid), queryW(nodeY, fx, tx, cur*2+2, mid, rx));
	}
	
	static void initializeH(int cur, int ly, int ry){
		if(ry -ly <= 1){
			initializeW(ly, 0, 0, WW);
			return ;
		}
		
		int mid = (ly+ry)/2;
		
		initializeH(2*cur+1, ly, mid);
		initializeH(2*cur+2, mid, ry);
		
		for(int j=0; j<segW; j++){
			segTree[cur][j] = Math.min(segTree[2*cur+1][j], segTree[2*cur+2][j]);
		}
	}
	
	static int queryH(int fy, int ty, int fx, int tx, int cur, int ly, int ry){
		if(ry<=fy || ty<=ly){
			return INF;
		}
		if(fy <=ly && ry<=ty){
			return queryW(cur, fx, tx, 0, 0, WW);
		}
		
		int mid = (ly+ry)/2;
		return Math.min(queryH(fy, ty, fx, tx, cur*2+1, ly, mid), queryH(fy, ty, fx, tx, cur*2+2, mid, ry));
	}
	
	static int query(int y1, int x1, int y2, int x2){
		return queryH(y1, y2, x1, x2, 0, 0, HH);
	}
}