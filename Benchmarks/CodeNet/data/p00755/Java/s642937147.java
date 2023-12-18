import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int w,h,c;
	int max;
	int[][] panel;
	void run() {
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if (w == 0 && h == 0 && c == 0) break;
			panel = new int[h+2][w+2];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) panel[i][j] = sc.nextInt();
			max = 0;
			BFS( 0 );
			System.out.println(max);
		}
		
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int cntColor( int color, int chclr, int x, int y ) {
//		for(int i=1;i<=h;i++) for(int j=1;j<=w;j++){
//			System.out.print(panel[i][j] + " ");
//			if (j==w)System.out.println();
//		}
//		System.out.println();
		
		int cnt=1;
		if( panel[y][x] != color )return 0;
		panel[y][x] = chclr;
		for(int i=0;i<4;i++) {
			if( panel[y+dy[i]][x+dx[i]] == color ) 
				cnt += cntColor( color, chclr, x+dx[i], y+dy[i]);
		}
		return cnt;
	}
	
	void BFS( int cnt ) {
		if( cnt == 5 ) {
//			System.out.println(panel[1][1] + " " + c);
			if( panel[1][1] == c ) {
//				printMap();
//				System.out.println();
				max = Math.max(max, cntColor(c,0,1,1));
			}
			return;
		}
		int[][] tmp = new int[h+2][w+2];
		for(int i=1;i<=h;i++) for(int j=1;j<=w;j++){
			tmp[i][j] = panel[i][j];
//			System.out.print(tmp[i][j] + " ");
//			if (j==w)System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			if(panel[1][1] != i)
				cntColor( panel[1][1], i, 1, 1 );
			BFS( cnt+1 );
			for(int j=1;j<=h;j++) for(int k=1;k<=w;k++)
				panel[j][k] = tmp[j][k];
		}
	}
	
	public void printMap(){
		for(int i=1;i<=h;i++) {
			for (int j=1;j<=w;j++) System.out.print(panel[i][j] +" ");
			System.out.println();
		}
	}
	
	public static void main( String[] args ) {
		new Main().run();
	}
}