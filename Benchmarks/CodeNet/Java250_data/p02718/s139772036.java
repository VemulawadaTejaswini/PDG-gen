import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    int N = nextInt();
	    double M = nextDouble();
	    int[] A = new int[N];
	    double max_vote = 0;
 
	    for(int i=0; i<N; i++){
	        A[i] = nextInt();
	        max_vote += A[i];
	    }
	    
	    int count = 0;
	    String flg = "No";
	    
	    for(int i=0; i<N; i++){
    	    if(A[i] >= (double)max_vote/(4*M)){
    	        count++;
    	    }
    	    if(count>=M){
    	        flg = "Yes";
    	        break;
    	    }
	    }
	    
        out.print(flg);
	}
 
	void preCalc() {
 
	}
 
	void stress() {
 
	}
 
	void test() {
 
	}
 
	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}
 
	static final Random rng = new Random();
 
	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}
 
	public static void main(String[] args) throws IOException {
		new Main();
	}
 
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
 
	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}
 
	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
 
	int nextInt() {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}