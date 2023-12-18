import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Map<Point,Integer> map= new HashMap<Point,Integer> ();
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
		char c[][] = new char[H][W];
		for (int i=0;i<H;i++) {
			String s = sc.next();
			char temp [] = s.toCharArray();
			for (int j=0;j<W;j++) {
				c[i][j] = temp[j];
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
		Point p = new Point();
		p.x = nh;
		p.y = nw;
		if (map.containsKey(p)) {
			int t = map.get(p);
			if (t<=m) {
				return ;
			} else {
				map.put(p, m);
			}
		} else {
			map.put(p, m);
		}
		if (nh==Dh&&nw==Dw) {
			if (result>m) {
				result = m;
			}
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
						bfs(c,nh+i,nw+j,Dh,Dw,H,W,m);
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
			return x*1000+y;
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