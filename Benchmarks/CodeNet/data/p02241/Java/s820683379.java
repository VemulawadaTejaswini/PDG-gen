import java.util.*;
import java.io.*;

public class Main {
	
	static int M[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); M=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)M[i][j]=Integer.parseInt(in.next());
		}
		prim(n);
	}
	
	static void prim(int n) {
		int INF=2000000000, d[]=new int[n], p[]=new int[n];
		char color[]=new char [n]; 
		for(int i=0;i<n;i++) {
			d[i]=INF;
			color[i]='W';
		}
		
		d[0]=0; p[0]=-1; //set [0] as start node
		
		while(true) {
			int mincost=INF,u=-1;
			for(int i=0;i<n;i++) {
				if(color[i] !='B' && d[i]<mincost) {
					mincost=d[i];
					u=i;
				}
			}
			
			if(mincost==INF)break;
			
			color[u]='B';
			
			for(int v=0;v<n;v++) {
				if(color[v]!='B' && M[u][v]!=-1) {
					if(M[u][v]<d[v]) {
						d[v]=M[u][v];
						p[v]=u;
						color[v]='G';
					}
				}
			}
		}
		
		int dsum=0;
		for(int i=1;i<n;i++) {
			dsum+=M[i][p[i]];
		}
		System.out.println(dsum);
	}

}


