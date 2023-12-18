import java.io.*;
import java.util.*;

public class Main {
    static long mod = (int)Math.pow(10,9)+7;
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		long[] a = sc.nextLongArray(n+1);
		long[] max = new long[n+2];
		long pow = 1;
		for(int i = 0; i <= n; i++){
		    max[i] = pow;
		    pow *= 2;
		}
		if(n == 0){
		    if(a[0] == 1){
		       System.out.println(1);
		       return;
		    }else{
		       System.out.println(-1);
		       return;
		    }
		}else if(a[0] != 0){
		    System.out.println(-1);
		    return;
		}
		long ans = 0;
		long now = 0;
		for(int i = n; i >= 1; i--){
		    now = Math.min(now+a[i],max[i]);
		    max[i] = now;
		}
		now = max[0];
		for(int i = 0; i <= n; i++){
		    now = Math.min(max[i],now);
		    ans += now;
		    //System.out.println(ans);
		    long b = now - a[i];
		    if(b < 0){
		        System.out.println(-1);
		        return;
		    }else{
		        now = b*2;
		    }
		}
		pw.println(ans);
		pw.close();
	}
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}

