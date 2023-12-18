import java.util.*;
import java.io.*;
public class Main {
	
	static int list[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); list=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			int u=Integer.parseInt(in.next()), k=Integer.parseInt(in.next());
			list[u][0]=k;
			for(int j=1;j<=k;j++) {
				int v=Integer.parseInt(in.next());
				list[u][j]=v;
			}
		}
		
		BFS(n);
	}
	
	static void BFS(int n) {
		Queue<Integer> q=new ArrayDeque<>();
		int S[]=new int[n+1], d=-1;
		for(int i=0;i<=n;i++)S[i]=-1;
		q.add(1);
		S[1]=0;
		while(!q.isEmpty()) {
			int u=q.remove();
			for(int i=1;i<=list[u][0];i++) {
				int next=list[u][i];
				if(S[next]==-1) {
					S[next]=S[u]+1;
					q.add(next);
				}
			}
		}
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<=n;i++) {
			out.println(i+" "+S[i]);
		}
		out.flush();
	}

}

