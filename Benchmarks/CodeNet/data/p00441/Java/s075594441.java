import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			int[] x = new int[n];
			int[] y = new int[n];
			boolean[][] p = new boolean[5001][5001];
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				x[i] = a;
				y[i] = b;
				p[a][b] = true;
			}
			int ans = 0;
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					int vx = x[j]-x[i];
					int vy = y[j]-y[i];
					int dist = vx*vx+vy*vy;
					if(dist<ans) {
						continue;
					}
					if((check(p,x[i]+vy,y[i]-vx) && check(p,x[j]+vy,y[j]-vx)) ||
							(check(p,x[i]-vy,y[i]+vx) && check(p,x[j]-vy,y[j]+vx))) {
						ans = dist;
					}
				}
			}
			System.out.println(ans);
		}
	}
	private static boolean check(boolean[][] p,int x,int y) {
		if (x>=0 && x<=5000 && y>=0 && y<=5000) {
			return p[x][y];
		}else{
			return false;
		}
	}
}