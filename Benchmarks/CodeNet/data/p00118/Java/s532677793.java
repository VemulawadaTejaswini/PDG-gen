import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int H = Integer.parseInt(st.nextToken());
				int W = Integer.parseInt(st.nextToken());
				int field[][] = new int[H][W];
				int check[][] = new int[H][W];
				for (int i=0;i<H;i++) {
					Arrays.fill(check[i],0);
					buf = br.readLine();
					for (int j=0;j<W;j++) {
						if (buf.charAt(j)=='@') {
							field[i][j] = 0;
						} else if (buf.charAt(j)=='#') {
							field[i][j] = 1;
						} else {
							field[i][j] = 2;
						}
					}
				}
				int count = 1;
				for (int i=0;i<H;i++) {
					for (int j=0;j<W;j++) {
						if (check[i][j]==0) {
							count = search(field,check,H,W,i,j,count);
						}
					}
				}
				//printField(field,H,W);
				//printField(check,H,W);
				System.out.println(count-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int search(int[][] f,int[][] c,int H,int W,int x,int y,int count) {
		c[x][y] = count;
		if (x+1<H) {
			if (f[x][y]==f[x+1][y]&&c[x+1][y]==0) search(f,c,H,W,x+1,y,count);
		}
		if (x-1>=0) {
			if (f[x][y]==f[x-1][y]&&c[x-1][y]==0) search(f,c,H,W,x-1,y,count);
		}
		if (y+1<W) {
			if (f[x][y]==f[x][y+1]&&c[x][y+1]==0) search(f,c,H,W,x,y+1,count);
		}
		if (y-1>=0) {
			if (f[x][y]==f[x][y-1]&&c[x][y-1]==0) search(f,c,H,W,x,y-1,count);
		}
		return count+1;
	}

	public static void printField(int[][] a,int H,int W) {
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) System.out.print(a[i][j]);
			System.out.println();
		}
	}
}