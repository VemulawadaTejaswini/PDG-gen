import java.util.Scanner;
public class Main {
	public static final int vx[] = {1,0,-1,0};
	public static final int vy[] = {0,-1,0,1};
	public static int h = 0;
	public static int w = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h+w==0) {
				break;
			}
			char[][] f = new char[w][h];
			for (int y=0;y<h;y++) {
				String line = sc.next();
				for(int x=0;x<w;x++) {
					f[x][y] = line.charAt(x);
				}
			}
			int ans = 0;
			for (int x=0;x<w;x++) {
				for (int y=0;y<h;y++) {
					if (f[x][y]!='.') {
						char tf = f[x][y];
						f[x][y] = '.';
						dfs(f,tf,x,y);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
	public static void dfs(char[][] f,char tf,int x,int y) {
		for(int i=0;i<4;i++) {
			int nx = x + vx[i];
			int ny = y + vy[i];
			if (nx>=0 && nx<w && ny>=0 && ny<h) {
				if (f[nx][ny]==tf) {
					f[nx][ny]='.';
					dfs(f,tf,nx,ny);
				}
			}
		}
	}
}