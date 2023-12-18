import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n, m;
	LinkedList<Integer>[] es;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			es=new LinkedList[n];
			for(int i=0; i<n; i++){
				es[i]=new LinkedList<Integer>();
			}
			for(int i=0; i<m; i++){
				int u=sc.nextInt()-1;
				int v=sc.nextInt()-1;
				es[u].add(v);
				es[v].add(u);
			}
			solve();
		}
	}

	void solve(){
		LinkedList<Integer> que=new LinkedList<Integer>();
		boolean[] visited=new boolean[n];
		int[] len=new int[n];
		que.offer(0);
		visited[0]=true;
		len[0]=0;
		int ans=-1;
		for(; !que.isEmpty();){
			int u=que.poll();
			if(len[u]>2){
				break;
			}
			ans++;
			for(int v : es[u]){
				if(!visited[v]){
					que.offer(v);
					visited[v]=true;
					len[v]=len[u]+1;
				}
			}
		}
		println(ans+"");
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}