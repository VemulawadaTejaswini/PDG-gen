import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Amazing Graze
public class Main{

	class R{
		int x, y;
		public R(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		List<R>[][] l = new List[500][500];
		for(int i=0;i<500;i++)for(int j=0;j<500;j++)l[i][j]=new ArrayList<R>();
		int[][] d = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
		int M = 21;
		for(;;){
			int AN = sc.nextInt(), BN = sc.nextInt(), R = sc.nextInt();
			if((AN|BN|R)==0)break;
			for(int i=0;i<500;i++)for(int j=0;j<500;j++)l[i][j].clear();
			for(int i=0;i<AN;i++){
				int x = sc.nextInt(), y = sc.nextInt();
				l[x/M][y/M].add(new R(x, y));
			}
			int res = 0;
			while(BN--!=0){
				int x = sc.nextInt(), y = sc.nextInt(), pi = x/M, pj = y/M;
				for(int k=0;k<9;k++){
					int ni = pi+d[k][0], nj = pj+d[k][1];
					if(0<=ni&&ni<500&&0<=nj&&nj<500)for(R r:l[ni][nj])res+=(r.x-x)*(r.x-x)+(r.y-y)*(r.y-y)<=16*R*R?1:0;
				}
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}