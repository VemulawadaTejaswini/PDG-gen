import java.util.*;
import java.io.*;

public class Main {
	
	static int M[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(); M=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)M[i][j]=-1;
		}
		
		for(int i=0;i<n;i++) {
			int u=Integer.parseInt(in.next()), k=Integer.parseInt(in.next());
			for(int j=0;j<k;j++) {
				int v=Integer.parseInt(in.next()), c=Integer.parseInt(in.next());
				M[u][v]=c;
			}
		}
		
		dijkstra(n);
	}
	
	static void dijkstra(int n) {
		int INF=2000000000,d[]=new int[n], p[]=new int[n];
		char color[]=new char[n];
		
		for(int i=0;i<n;i++) {
			d[i]=INF;
			color[i]='W';
		}
		
		d[0]=0; p[0]=-1;
		
		while(true) {
			int mincost=INF, u=-1;
			for(int i=0;i<n;i++) {
				if(color[i]!='B' && d[i]<mincost) {
					mincost=d[i];
					u=i;
				}
			}
			
			if(mincost==INF)break;
			color[u]='B';
			
			for(int v=0;v<n;v++) {
				if(color[v]!='B' && M[u][v]!=-1) {
					if(d[v]>M[u][v]) {
						p[v]=u;
						d[v]=M[u][v]+d[u];
						color[v]='G'; 
					}
				}
			}
		}
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			out.println(i+" "+d[i]);
		}
		out.flush();
	}
}

