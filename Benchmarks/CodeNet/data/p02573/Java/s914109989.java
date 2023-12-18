import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int mx;
	static boolean[] visit;
	static ArrayList<ArrayList<Integer>> adj;
	
	public static void bfs(int s) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(s);
		visit[s]=true;
		
		int ctr=1;
		
		while(!q.isEmpty()) {
			int u=q.poll();
			
			for(int e=0;e<adj.get(u).size();e++) {
				int v=adj.get(u).get(e);
				if(!visit[v]) {
					visit[v]=true;
					ctr++;
				}
			}
		}
		
		mx=Math.max(mx, ctr);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Rf.init(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		int N=Rf.nextInt();
		int M=Rf.nextInt();
		
		mx=1;
		adj=new ArrayList<ArrayList<Integer>>();
		for(int r=0;r<N;r++) {
			adj.add(new ArrayList<Integer>());
		}
		
		for(int w=0;w<M;w++){
			int A=Rf.nextInt();
			int B=Rf.nextInt();
			A--;
			B--;
			adj.get(A).add(B);
			adj.get(B).add(A);
		}	
		
		visit=new boolean[N];
		Arrays.fill(visit,false);
		
		for(int w=0;w<N;w++) {
			if(!visit[w]) {
				bfs(w);
			}
		}
		
		pw.println(mx);
		pw.close();
		
	}

}

/** Class for buffered reading int and double values */
class Rf {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			// TODO add check for eof if necessary
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
	
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}
