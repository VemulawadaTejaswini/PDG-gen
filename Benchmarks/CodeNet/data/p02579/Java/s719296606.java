import java.util.Scanner;

public class Main {

	public int map[][];
	int result = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int Ch= sc.nextInt();
		int Cw= sc.nextInt();
		int Dh = sc.nextInt();
		int Dw= sc.nextInt();
		Main main = new Main();
		main.map= new int[H][W];
		char c[][] = new char[H][W];
		for (int i=0;i<H;i++) {
			String s = sc.next();
			char temp [] = s.toCharArray();
			for (int j=0;j<W;j++) {
				c[i][j] = temp[j];
			}
		}
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				main.map[i][j]=Integer.MAX_VALUE;
			}
		}
		main.bfs(c, Ch-1, Cw-1, Dh-1, Dw-1, H, W, 0);
		if (main.result==Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.print(main.result);
		}
	}

	public void bfs (char c[][],int nh,int nw,int Dh,int Dw,int H,int W,int m) {
		if (m>=result) {
			return ;
		}
		if (map[nh][nw]<=m) {
			return ;
		} else {
			map[nh][nw]=m;
		}
		if (nh==Dh&&nw==Dw) {
			if (result>m) {
				result = m;
			}
		}
		if (nh+1<H&&c[nh+1][nw]!='#') {
			bfs(c,nh+1,nw,Dh,Dw,H,W,m);
		}
		if (nh-1>=0&&c[nh-1][nw]!='#') {
			bfs(c,nh-1,nw,Dh,Dw,H,W,m);
		}
		if(nw-1>=0&&c[nh][nw-1]!='#') {
			bfs(c,nh,nw-1,Dh,Dw,H,W,m);
		}if(nw+1<W&&c[nh][nw+1]!='#') {
			bfs(c,nh,nw+1,Dh,Dw,H,W,m);
		}
		for (int i=-2;i<=2;i++) {
			for (int j=-2;j<=2;j++) {
				if (i==0&&j==0) {
					continue;
				}
				if (nh+i>=0&&nh+i<H&&nw+j>=0&&nw+j<W) {
					if(c[nh+i][nw+j]=='#') {
						continue;
					}
					if ((i==1&&j==0)||(i==0&&j==-1)||(i==-1&&j==0)||(i==0&&j==1)) {
						continue;
					} else {
						bfs(c,nh+i,nw+j,Dh,Dw,H,W,m+1);
					}
				}
			}
		}
	}

	public class Point extends Object{
		int x;
		int y;

		public int hashCode() {
			return x*100+y;
		}

		public boolean equals(Object o) {
			Point temp = (Point)o;
			if (temp.x==x&&temp.y==y) {
				return true;
			}
			return false;
		}
	}
}