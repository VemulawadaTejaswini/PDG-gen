import java.io.*;
import java.util.*;

public class Main {
	
	static List<List<Integer>> list;
	static boolean status[];
	
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
		
		int q=in.nextInt();
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<q;i++) {
			status=new boolean[n];
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			if(solve(n,s,t))out.println("yes");
			else out.println("no");
		}
		out.flush();
	}
	
	static boolean solve(int n,int s, int t) {
		Queue<Integer> q=new ArrayDeque<>();
		q.add(s);
		status[s]=true;
		
		while(!q.isEmpty()) {
			int u=q.remove();
			for(int i=0;i<list.get(u).size();i++) {
				int next=list.get(u).get(i);
				if(!status[next]) {
					if(next==t)return true;
					status[next]=true;
					q.add(next);
				}
			}
		}
		return false;
	}
}

