import java.util.Scanner;


public class Main {

	static int M[][];

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		M=new int[n][n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)M[i][j]=Integer.parseInt(in.next());
		}

		int INF=2000000001, d[]=new int[n], p[]=new int[n];
		char color[]=new char[n];

		for(int i=0;i<n;i++){
			color[i]='W';
			d[i]=INF;
		}

		d[0]=0; p[0]=-1;

		while(true){
			int mincost=INF, u=-1;

			for(int i=0;i<n;i++){
				if(color[i]!='B' && d[i]<mincost){
					mincost=d[i];
					u=i;
				}
			}

			if(u==-1)break;

			color[u]='B';

			for(int v=0;v<n;v++){
				if(color[v]!='B' && M[u][v]!=-1){
					if(M[u][v]<d[v]){
						d[v]=M[u][v];
						color[v]='G';
					}
				}
			}
		}

		int sum=0;
		for(int i=0;i<n;i++){
			if(d[i]!=-1)sum+=d[i];
		}
		System.out.println(sum);

	}

}

