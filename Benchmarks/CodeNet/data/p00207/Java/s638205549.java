import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Point {
	int x,y;
	Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int w,h,xs,ys,xg,yg,n,c,d,x,y;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				w = Integer.parseInt(st.nextToken());
				h = Integer.parseInt(st.nextToken());
				int board[][] = new int[h][w];
				int check[][] = new int[h][w];
				for (int i=0;i<h;i++) {
					Arrays.fill(board[i],-1);
					Arrays.fill(check[i],0);
				}
				st = new StringTokenizer(br.readLine());
				xs = Integer.parseInt(st.nextToken())-1;
				ys = Integer.parseInt(st.nextToken())-1;
				st = new StringTokenizer(br.readLine());
				xg = Integer.parseInt(st.nextToken())-1;
				yg = Integer.parseInt(st.nextToken())-1;
				n = Integer.parseInt(br.readLine());
				for (int i=0;i<n;i++) {
					st = new StringTokenizer(br.readLine());
					c = Integer.parseInt(st.nextToken());
					d = Integer.parseInt(st.nextToken());
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					PutBlock(board,x,y,c,d);
				}
				if (board[ys][xs]==-1) {
					System.out.println("NG");
					continue;
				}
				boolean OK = false;
				Point queue[] = new Point[h*w];
				int p = 0;
				queue[p++] = new Point(xs,ys);
				while (p>0) {
					Point dq = queue[--p];
					check[dq.y][dq.x] = 1;
					if (dq.x==xg&&dq.y==yg) {
						OK = true;
						break;
					}
					if (dq.x>0) {
						if (board[dq.y][dq.x-1]==board[dq.y][dq.x]&&check[dq.y][dq.x-1]==0) {
							queue[p++] = new Point(dq.x-1,dq.y);
						}
					}
					if (dq.x<w-1) {
						if (board[dq.y][dq.x+1]==board[dq.y][dq.x]&&check[dq.y][dq.x+1]==0) {
							queue[p++] = new Point(dq.x+1,dq.y);
						}
					}
					if (dq.y>0) {
						if (board[dq.y-1][dq.x]==board[dq.y][dq.x]&&check[dq.y-1][dq.x]==0) {
							queue[p++] = new Point(dq.x,dq.y-1);
						}
					}
					if (dq.y<h-1) {
						if (board[dq.y+1][dq.x]==board[dq.y][dq.x]&&check[dq.y+1][dq.x]==0) {
							queue[p++] = new Point(dq.x,dq.y+1);
						}
					}
				}
				if (OK) System.out.println("OK");
				else System.out.println("NG");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void PutBlock(int[][] b,int x,int y,int c,int target) {
		if (target==0) {
			for (int i=y-1;i<y+1;i++) {
				for (int j=x-1;j<x+3;j++) b[i][j] = c;
			}
		} else {
			for (int i=y-1;i<y+3;i++) {
				for (int j=x-1;j<x+1;j++) b[i][j] = c;
			}
		}
	}

	public static void PrintBoard(int[][] b,int h,int w) {
		for (int i=0;i<h;i++) {
			for (int j=0;j<w;j++) System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}
}