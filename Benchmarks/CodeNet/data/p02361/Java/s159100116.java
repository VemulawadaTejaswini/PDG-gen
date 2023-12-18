import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int v=sc.nextInt();//頂点数
			int e=sc.nextInt();//辺数
			int r=sc.nextInt();//始点
			int inf=100000000;
			int[] c=new int[v+1];//始点からの距離
			int[][] w=new int[v+1][v+1];//各頂点ごとの距離
			Arrays.fill(c, inf);
			for(int i=0; i<v; i++) {
				for(int j=0; j<v; j++) {
					w[i][j]=inf;
				}
			}
			for(int i=0; i<e; i++) {
				int s=sc.nextInt();
				int t=sc.nextInt();
				int d=sc.nextInt();
				w[s][t]=d;
			}
			c[r]=0;
			for(int k=0; k<v; k++) {
				boolean update=false;
				for(int i=0; i<v; i++) {
					for(int j=0; j<v; j++) {
						if(c[i]<inf && w[i][j]!=inf) {
							if(c[j]>c[i]+w[i][j]) {
								c[j]=c[i]+w[i][j];
								update=true;
							}
						}
					}
				}
				if(! update) break;
			}
			for(int i=0; i<v; i++) {
				if(c[i]==inf) {
					System.out.println("INF");
				}
				else {
					System.out.println(c[i]);
				}
			}
		}
	}
}
