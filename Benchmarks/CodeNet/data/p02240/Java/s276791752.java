import java.io.*;
import java.util.*;

public class Main {
	
	static List<List<Integer>> list;
	static int status[];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(), m=in.nextInt();list=new ArrayList<List<Integer>>();
		for(int i=0;i<n;i++) {
			List<Integer> l=new ArrayList<>();
			list.add(l);
		}
		
		for(int i=0;i<m;i++) {
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			list.get(s).add(t);
			list.get(t).add(s);
		}
		
		status=new int[n];
		int color=1;
		for(int i=0;i<n;i++) {
			if(status[i]==0) {
				solve(n,i,color);
				color++;
			}
		}
		int q=in.nextInt();
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<q;i++) {
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			if(status[s]==status[t])out.println("yes");
			else out.println("no");
		}
		out.flush();
	}
	
	static void solve(int n,int s,int c) {
		Queue<Integer> q=new ArrayDeque<>();
		q.add(s);
		status[s]=c;
		
		while(!q.isEmpty()) {
			int u=q.remove();
			for(int i=0;i<list.get(u).size();i++) {
				int next=list.get(u).get(i);
				if(status[next]==0) {
					status[next]=c;
					q.add(next);
				}
			}
		}
	}
}

