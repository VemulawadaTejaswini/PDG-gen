
import java.util.Scanner;

public class Main{
	int n,m,k;
	int[][] d,d2;
	int V,E;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}
	
	void run(){
		int max=Integer.MAX_VALUE;

		Scanner sc=new Scanner(System.in);
		while(true){
			E=sc.nextInt();
			V=sc.nextInt();
			if(E+V==0)break;
			d=new int[V][V];
			d2=new int[V][V];


			for(int i=0;i<V;i++){
				for(int j=0;j<V;j++){
					d[i][j]=max;
					d2[i][j]=max;
				}
			}
			for(int i=0;i<E;i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				int cost=sc.nextInt();
				int time=sc.nextInt();
				d[a][b]=cost;
				d[b][a]=cost;
				d2[a][b]=time;
				d2[b][a]=time;
			}
			for(int kk=0;kk<V;kk++){
				for(int i=0;i<V;i++){
					for(int j=0;j<V;j++){
						if(d[i][kk]!=max&&d[kk][j]!=max){
							d[i][j]=Math.min(d[i][j], d[i][kk]+d[kk][j]);
						}
						if(d2[i][kk]!=max&&d2[kk][j]!=max){
							d2[i][j]=Math.min(d2[i][j], d2[i][kk]+d2[kk][j]);
						}
					}
				}
			}
			k=sc.nextInt();

			for(int i=0;i<k;i++){
				int p=sc.nextInt()-1;
				int q=sc.nextInt()-1;
				int r=sc.nextInt();
				solve(p,q,r);
			}
		}
	}
	
	void solve(int p,int q,int r){
		if(r==0){
			System.out.println(d[p][q]);
		}else{
			System.out.println(d2[p][q]);
		}
	}
}