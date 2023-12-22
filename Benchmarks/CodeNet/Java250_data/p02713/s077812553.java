import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    int N = nextInt();
        int[] param = new int[3];
        int g = 0;
        long sum = 0;

        for(int i=1; i<=N; i++){
            param[0] = i;
            for(int j=1; j<=N; j++){
                param[1] = j;
                for(int k=1; k<=N; k++){
                    param[2] = k;
                    g = gcd(param[0], param[1]);
                    g = gcd(g, param[1]);
                    g = gcd(g, param[2]);
                    sum += g;
                }
            }
        }
        out.println(sum);
    }

    public static final int gcd(int a, int b) {
        //a > b にする（スワップ）
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
    
        //ユークリッドの互除法
        int r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
    
        return a;    //b には r=0 の値が入るため、a を返す
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