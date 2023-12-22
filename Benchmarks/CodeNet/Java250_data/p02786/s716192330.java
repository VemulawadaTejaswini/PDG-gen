import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main{
	public static void main(String[] args) throws Exception {
	IO io = new IO();
	PrintWriter out = new PrintWriter(System.out);
	Solver sr = new Solver();
	sr.solve(io,out);
	out.flush();
	out.close();
    	}

	static class Solver
	{
      void preCalculate(long[] ar)
      {
        ar[0]=1L;
        for(int i=1 ; i<=40 ; i++)
        {
          ar[i] = (1L<<i)+ar[i-1];
          //System.out.println(ar[i]);
        }
        
      }
	    void solve(IO io, PrintWriter out)
	    {
           int i, j=0;
           	long n = io.nextLong();
          long[] pre = new long[41];
          preCalculate(pre);
          	for(i=0 ; i<64 ; i++)
            {
              	if(((1L<<i)&n)!=0)
                {
                  	j=i;
                  //out.println(j);
                }
            }
          	out.print(pre[j]);
	    }
    	
	}
	//Special thanks to Petr (on codeforces) who inspired me to implement IO class!
	static class IO
	{
    	BufferedReader reader;
        StringTokenizer tokenizer;
    	public IO() {
                reader = new BufferedReader(new InputStreamReader(System.in));
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
        public String nextLine() {
            String s="";
            try {
                    s=reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            return s;
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    
        public long nextLong() {
            return Long.parseLong(next());
        }
    	double nextDouble()
    	{
    		return Double.parseDouble(next());
    	}
	}
}