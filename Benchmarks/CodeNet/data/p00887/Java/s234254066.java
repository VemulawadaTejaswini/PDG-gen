
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int h, w, d;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt(); h = sc.nextInt(); d = sc.nextInt();
			if((h|w|d) == 0) break;
			
			boolean[][] v = new boolean[h][w];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) v[i][j] = sc.nextInt() == 1;
			
			boolean[][][] A = new boolean[h][w][h*w];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) {
				A[i][j][i*w+j] = true;
				for(int k=-d;k<=d;k++) {
					int x = j + k, y = i + d - abs(k);
					if(!out(x, y)) A[i][j][y*w+x] = true;
					y = i - d + abs(k);
					if(!out(x, y)) A[i][j][y*w+x] = true;
				}
			}
//			for(boolean[][] a:A) for(boolean[] b: a)debug(b);
			boolean ng = false;
			for(int i=0;i<h && !ng;i++) for(int j=0;j<w && !ng;j++) {
				int px = -1, py = -1;
				for(int k=i*w+j;k<h*w;k++){
					int y = k/w, x = k%w;
					if(A[y][x][i*w+j]) {
						px = x; py = y; break;
					}
				}
				if(px>=0) swap(j, i, px, py, A, v);
				else continue;
				
				for(int k=0;k<h*w;k++)if(k != i*w+j) {
					int y = k/w, x = k%w;
					if(!A[y][x][i*w+j]) continue;
					for(int l=i*w+j;l<w*h;l++) A[y][x][l] = A[y][x][l]^A[i][j][l];
					v[y][x] = v[y][x]^v[i][j];
				}
			}
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) ng |= !A[i][j][i*w+j] && v[i][j];
//			debug(ng);
			System.out.println((!ng? 1: 0));
		}
	}
	
	void swap(int x1, int y1, int x2, int y2, boolean[][][] A, boolean[][] v) {
		boolean[] tmp = new boolean[w*h];
		System.arraycopy(A[y1][x1], 0, tmp, 0, w*h);
		System.arraycopy(A[y2][x2], 0, A[y1][x1], 0, w*h);
		System.arraycopy(tmp, 0, A[y2][x2], 0, w*h);
		boolean tmp2 = v[y1][x1]; v[y1][x1] = v[y2][x2]; v[y2][x2] = tmp2;
	}
	
	boolean out(int x, int y) {
		return x < 0 || y < 0 || x >= w || y >= h;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}