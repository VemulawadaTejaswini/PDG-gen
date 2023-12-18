import java.util.Scanner;

//Reindeer with no sense of direction
public class Main{

	int move[][] = {{-1,0},{0,1},{1,0},{0,-1}};
	int w, h, n, gi, gj, G = -2;
	int[][] a;
	int res;
	
	void dfs(int state, int i, int j){
//		System.out.println("State:"+state+" "+i+","+j);
		if(state==(1<<n)-1){
			if(i==gi||j==gj)res++;
			return;
		}
		for(int k=0;k<4;k++){
			int ni = i+move[k][0], nj = j+move[k][1];
			while(0<=ni&&ni<h&&0<=nj&&nj<w){
				if(a[ni][nj]>=0){
					if(((state>>a[ni][nj])&1)==0){
						dfs(state+(1<<a[ni][nj]), ni, nj);
						break;
					}
				}
				ni += move[k][0]; nj += move[k][1];
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			n = 0;
			a = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				a[i][j] = sc.nextInt();
				if(a[i][j]==1)a[i][j] = n++;
				else if(a[i][j]==2){
					a[i][j] = G; gi = i; gj = j;
				}
				else if(a[i][j]==0)a[i][j] = -1;
			}
			res = 0;
			dfs(0, gi, gj);
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}