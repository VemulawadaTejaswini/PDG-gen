import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Filling Game
public class Main{

	int h, w;
	int[][] a;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	boolean[][][] u;
	int[] c;
	boolean[][] con;
	int sum;
	
	boolean ok(int i, int j){
		return 0<=i&&i<h&&0<=j&&j<w;
	}
	
	void chain(int i, int j, int K, int id){
		if(con[i][j]||u[id][i][j]||a[i][j]!=K)return;
		u[id][i][j] = true;
		c[id]++;
		for(int k=0;k<4;k++){
			int ni = i+d[k][0], nj = j+d[k][1];
			if(ok(ni, nj))chain(ni, nj, K, id);
		}
	}
	
	void f(int i, int j, int K){
		if(con[i][j]||a[i][j]!=K)return;
		con[i][j] = true;
		sum++;
		for(int k=0;k<4;k++){
			int ni = i+d[k][0], nj = j+d[k][1];
			if(ok(ni, nj))f(ni, nj, K);
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			a = new int[h][w];
			con = new boolean[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				char c = sc.next().charAt(0);
				a[i][j] = c=='R'?0:c=='G'?1:2;
			}
			sum = 0;
			f(0, 0, a[0][0]);
			int res = 0;
//			debug(a);
			for(;sum<h*w;res++){
//				p();
//				System.out.println("SUM:"+sum);
				Set<Integer> s1 = new HashSet<Integer>(), s2 = new HashSet<Integer>();
				int c1 = (a[0][0]+1)%3, c2 = (a[0][0]+2)%3;
				for(int i=0;i<h;i++)for(int j=0;j<w;j++){
					if(con[i][j])continue;
//					System.out.println(i+" "+j);
					for(int k=0;k<4;k++){
						int ni = i+d[k][0], nj = j+d[k][1];
						if(ok(ni, nj)&&con[ni][nj]){
							if(a[i][j]==c1)s1.add(i*w+j);
							else if(a[i][j]==c2)s2.add(i*w+j);
						}
					}
				}
				u = new boolean[2][h][w];
				c = new int[2];
				for(int x:s1)chain(x/w, x%w, c1, 0);
				for(int x:s2)chain(x/w, x%w, c2, 1);
				if(c[1]<c[0]){
					for(int i=0;i<h;i++)for(int j=0;j<w;j++){
						if(con[i][j])a[i][j] = c1;
						else if(u[0][i][j]){
							con[i][j] = true; sum++;
						}
					}
				}
				else{
					for(int i=0;i<h;i++)for(int j=0;j<w;j++){
						if(con[i][j])a[i][j] = c2;
						else if(u[1][i][j]){
							con[i][j] = true; sum++;
						}
					}
				}
			}
			System.out.println(res);
		}
	}
	
	void p(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++)System.out.print(con[i][j]?"o":"x");
			System.out.println();
		}
		System.out.println();
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}