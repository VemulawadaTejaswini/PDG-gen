import java.io.*;
import java.util.*;
// https://www.geeksforgeeks.org/prime-factorization-using-sieve-olog-n-multiple-queries/
public class d {
	public static PrintWriter out;
	public static InputReader in;
	public static int MAXN = 10000001; 
       
    // stores smallest prime factor for every number 
    public static int spf[] = new int[MAXN]; 
       
    // Calculating SPF (Smallest Prime Factor) for every 
    // number till MAXN. 
    // Time Complexity : O(nloglogn) 
    public static void sieve() 
    { 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++) 
       
            // marking smallest prime factor for every 
            // number to be itself. 
            spf[i] = i; 
       
        // separately marking spf for every even 
        // number as 2 
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
       
        for (int i=3; i*i<MAXN; i++) 
        { 
            // checking if i is prime 
            if (spf[i] == i) 
            { 
                // marking SPF for all numbers divisible by i 
                for (int j=i*i; j<MAXN; j+=i) 
       
                    // marking spf[j] if it is not  
                    // previously marked 
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
       
    // A O(log n) function returning primefactorization 
    // by dividing by smallest prime factor at every step 
    public static long getFactorization(int x) 
    { 
        // Vector<Integer> ret = new Vector<>(); 
        long ret = 1;
        int prev = -1;
        long ct = 1;
        while (x != 1) 
        {
            int yo = prev;
            prev = spf[x];
            if(yo!=prev)
            {
            	ret*=ct;
            	ct=1;
            }
            ct+=1;
            prev = spf[x];
            // out.println(spf[x]);
            x = x / spf[x];
            if(x==1)
            {
            	ret*=ct;
            }
        } 
        return ret; 
    }
	public static void main(String[] args)throws IOException {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);
        sieve();
		int cases = in.nextInt();
		long ans = 0;
		// out.println(getFactorization(8));
		for(int t = 1; t <= cases; t++){
			;
			// out.println("t="+t+" v:"+getFactorization(t));
			ans+=(((long)t)*((long)getFactorization(t)));
		}

		out.println(ans);
        out.close();
	}
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}