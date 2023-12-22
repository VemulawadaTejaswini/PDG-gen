import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {

	    String C = nextString();
	    String C_before = C.substring(0, (C.length()-1)/2);
	    String C_after = C.substring(((C.length()+3)/2)-1, C.length());	    

        StringBuffer C_sb = new StringBuffer(C);
        StringBuffer C_bsb = new StringBuffer(C_before);
        StringBuffer C_asb = new StringBuffer(C_after);

        String C_rev = C_sb.reverse().toString();        
        String C_before_rev = C_bsb.reverse().toString();
        String C_after_rev = C_asb.reverse().toString();        

        String flg = "No";
        
        if(C.equals(C_rev) && C_before.equals(C_before_rev) && C_after.equals(C_after_rev)){
            flg = "Yes";
        }     
        out.println(flg);
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