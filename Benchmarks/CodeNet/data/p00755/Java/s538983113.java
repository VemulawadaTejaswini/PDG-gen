import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int c = sc.nextInt();
			if (h==0) {
				break;
			}
			int[][] col = new int[h][w];
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					col[i][j] = sc.nextInt();
				}
			}
			int[][] temp = new int[h][w];
			int[] p = {1,1,1,1,c};
			int ans = 0;
			do {
				for(int i=0;i<h;i++) {
					for(int j=0;j<w;j++) {
						temp[i][j] = col[i][j];
					}
				}
				UnionFind uf = new UnionFind(h*w);
				for(int i=0;i<6;i++) {
					for(int j=0;j<h-1;j++) {
						for(int k=0;k<w;k++) {
							if (temp[j][k] == temp[j+1][k]) {
								uf.union(j*w+k, (j+1)*w+k);
							}
						}
					}
					for(int j=0;j<h;j++) {
						for(int k=0;k<w-1;k++) {
							if (temp[j][k] == temp[j][k+1]) {
								uf.union(j*w+k, j*w+k+1);
							}
						}
					}
					if (i==5) {
						break;
					}
					for(int j=0;j<h*w;j++) {
						if (uf.isConnected(0, j)) {
							temp[j/w][j%w] = p[i];
						}
					}
				}
				ans = Math.max(ans,uf.size(0));
			} while(next(p));
			System.out.println(ans);
		}
	}

	static boolean next(int[] p) {
		long num = 0;
		for(int i=3;i>=0;i--) {
			num*=6;
			num+=(p[i]-1);
		}
		num+=1;
		//System.out.println(num);
		if (num >= 6*6*6*6) {
			return false;
		}
		for(int i=0;i<4;i++) {
			p[i] = (int) (num%6+1);
			num/=6;
		}
		return true;
	}
}
class UnionFind {
	private int[] data;
	public UnionFind(int size) {
		data = new int[size];
		Arrays.fill(data, -1);
	}
	public void union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (data[y] < data[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
	public int size(int x) {
		return -data[root(x)];
	}
	public String toString() {
		return Arrays.toString(data);
	}
}