import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Seven Puzzle
public class Main{

	static int f(int[][] a){
		int x = 0;
		for(int i=0;i<2;i++)for(int j=0;j<4;j++){x*=10;x+=a[i][j];}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
		while(sc.hasNext()){
			int[][] m = new int[2][4];
			for(int i=0;i<2;i++)for(int j=0;j<4;j++)m[i][j]=sc.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			set.add(f(m));
			List<int[][]> l = new ArrayList<int[][]>();
			l.add(m);
			int step = 0;
			while(!l.isEmpty()){
				List<int[][]> next = new ArrayList<int[][]>();
				for(int[][] a:l){
					int v = f(a);
					if(v==1234567){
						next.clear();
						System.out.println(step);
						break;
					}
					int pi = 0;
					int pj = 0;
					for(int i=0;i<2;i++)for(int j=0;j<4;j++)if(a[i][j]==0){
						pi = i;
						pj = j;
					}
					for(int k=0;k<4;k++){
						int ni = pi+move[k][0];
						int nj = pj+move[k][1];
						if(0<=ni&&ni<2&&0<=nj&&nj<4){
							int[][] t = new int[2][4];
							for(int i=0;i<2;i++)for(int j=0;j<4;j++)t[i][j]=a[i][j];
							int tmp = t[ni][nj];
							t[ni][nj] = t[pi][pj];
							t[pi][pj] = tmp;
							int u = f(t);
							if(!set.contains(u)){
								set.add(u);
								next.add(t);
							}
						}
					}
				}
				step++;
				l = next;
			}
		}
	}
}