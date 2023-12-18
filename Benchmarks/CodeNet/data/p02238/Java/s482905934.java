import java.io.*;
import java.util.*;

public class Main {
	
	static int ns[],res[][],L[][];
	static int time=1;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(); L=new int[n+1][n+1];
		ns=new int[n+1]; res=new int[n+1][2];
		
		 for(int i=0;i<n;i++) {
			 int u=Integer.parseInt(in.next()), k=Integer.parseInt(in.next());
			 
			 for(int j=0;j<k;j++) {
				 int v=Integer.parseInt(in.next());
				 L[u][v]=1;
			 }
		 }
		 
		 Stack<Integer> stk=new Stack<>();
		 stk.push(1);
		 
		 DFS(stk);
		 
		 PrintWriter out=new PrintWriter(System.out);
		 for(int i=1;i<=n;i++)out.printf("%d %d %d\n", i, res[i][0], res[i][1]);
		 out.flush();
	}
	
	static void DFS(Stack<Integer> stk) {
		int v=stk.peek();
		ns[v]=1; res[v][0]=time; time++;
		
		for(int i=1;i<=ns.length-1;i++) {
			if(L[v][i]==1 && ns[i]!=1) {
				stk.push(i);
				DFS(stk);
			}
		}
		
		res[v][1]=time; time++;
		stk.pop();
		return;
	}
}

