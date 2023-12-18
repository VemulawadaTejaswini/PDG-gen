import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
	
	//make it false if Multiple test case is not in the question
	static boolean multipleTC = false;
	
	//for pre processing if needed
	void pre() throws Exception
	{}
		public static void main(String[] args) throws Exception{
			
		new Main().run();
	  }
	  



	// input output handled here
	private String in_out(int tc) throws Exception{
		  //take input here
		  int n=ni();
		  BigInteger count=BigInteger.ZERO;
		  for(int i=1;i<=n;i++){
			count=count.add(BigInteger.valueOf(factor(i)*i)) ;
			//pln(count);
		  }
		  

		return count.toString();

	}


	static void SieveOfEratosthenes(int n, boolean prime[], 
                                    boolean primesquare[], int a[]) 
    { 
      
        for (int i = 2; i <= n; i++) 
            prime[i] = true; 

        for (int i = 0; i < ((n * n) + 1); i++) 
            primesquare[i] = false; 
  
        // 1 is not a prime number 
        prime[1] = false; 
  
        for (int p = 2; p * p <= n; p++) { 

            if (prime[p] == true) { 
                for (int i = p * 2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        int j = 0; 
        for (int p = 2; p <= n; p++) { 
            if (prime[p]) { 

                a[j] = p; 

                primesquare[p * p] = true; 
                j++; 
            } 
        } 
    } 
    static int factor(int n) 
    { 
        
        if (n == 1) 
            return 1; 
  
        boolean prime[] = new boolean[n + 1]; 
        boolean primesquare[] = new boolean[(n * n) + 1]; 
  
        int a[] = new int[n]; 
        SieveOfEratosthenes(n, prime, primesquare, a); 
        int ans = 1; 
  
        for (int i = 0;; i++) { 

            if (a[i] * a[i] * a[i] > n) 
                break; 
            int cnt = 1; 

            while (n % a[i] == 0) { 
                n = n / a[i]; 
  
                cnt = cnt + 1; 
            } 
            ans = ans * cnt; 
        } 
  
        if (prime[n]) 
            ans = ans * 2; 

        else if (primesquare[n]) 
            ans = ans * 3; 

        else if (n != 1) 
            ans = ans * 4; 
  
        return ans;
    } 
	
	

	

	
	
	void run() throws Exception{
	//	long start_time=System.nanoTime();

		//in = new FastReader("input.txt");  out = new PrintWriter("output.txt");
		in = new FastReader(); out = new PrintWriter(System.out);
		


		StringBuilder print=new StringBuilder("");
		pre();
		int T = (multipleTC)?ni():1;
		for(int t = 1; t<= T; t++){
		print.append(in_out(t)).append("\n");
		}

		p(print);
		//long end_time=System.nanoTime();
		//System.out.println("Running Time in nano sec : "+(end_time-start_time));
		
		out.flush();
		out.close();
	}
	
	PrintWriter out;
		FastReader in;
		
			void p(Object o)
				{out.print(o);}
			void pln(Object o)
				{out.println(o);}
			void pnf(Object o)
				{out.println(o);
				out.flush();}
		
			String n()throws Exception
				{return in.readLine();}
		
			String nln()throws Exception
				{return in.readLine();}
		
			int ni()throws Exception
				{return (in.nextInt());}
		
			long nl()throws Exception
				{return in.nextLong();}
		
			double nd()throws Exception
				{return in.nextDouble();}
	
				static class FastReader 
				{ 
					final private int BUFFER_SIZE = 1 << 16; 
					private DataInputStream din; 
					private byte[] buffer; 
					private int bufferPointer, bytesRead; 
			  
					public FastReader() 
					{ 
						din = new DataInputStream(System.in); 
						buffer = new byte[BUFFER_SIZE]; 
						bufferPointer = bytesRead = 0; 
					} 
			  
					public FastReader(String file_name) throws IOException 
					{ 
						din = new DataInputStream(new FileInputStream(file_name)); 
						buffer = new byte[BUFFER_SIZE]; 
						bufferPointer = bytesRead = 0; 
					} 
			  
					public String readLine() throws IOException 
					{ 
						byte[] buf = new byte[64]; // line length 
						int cnt = 0, c; 
						while ((c = read()) != -1) 
						{ 
							if (c == '\n') 
								break; 
							buf[cnt++] = (byte) c; 
						} 
						return new String(buf, 0, cnt); 
					} 
			  
					public int nextInt() throws IOException 
					{ 
						int ret = 0; 
						byte c = read(); 
						while (c <= ' ') 
							c = read(); 
						boolean neg = (c == '-'); 
						if (neg) 
							c = read(); 
						do
						{ 
							ret = ret * 10 + c - '0'; 
						}  while ((c = read()) >= '0' && c <= '9'); 
			  
						if (neg) 
							return -ret; 
						return ret; 
					} 
			  
					public long nextLong() throws IOException 
					{ 
						long ret = 0; 
						byte c = read(); 
						while (c <= ' ') 
							c = read(); 
						boolean neg = (c == '-'); 
						if (neg) 
							c = read(); 
						do { 
							ret = ret * 10 + c - '0'; 
						} 
						while ((c = read()) >= '0' && c <= '9'); 
						if (neg) 
							return -ret; 
						return ret; 
					} 
			  
					public double nextDouble() throws IOException 
					{ 
						double ret = 0, div = 1; 
						byte c = read(); 
						while (c <= ' ') 
							c = read(); 
						boolean neg = (c == '-'); 
						if (neg) 
							c = read(); 
			  
						do { 
							ret = ret * 10 + c - '0'; 
						} 
						while ((c = read()) >= '0' && c <= '9'); 
			  
						if (c == '.') 
						{ 
							while ((c = read()) >= '0' && c <= '9') 
							{ 
								ret += (c - '0') / (div *= 10); 
							} 
						} 
			  
						if (neg) 
							return -ret; 
						return ret; 
					} 
			  
					private void fillBuffer() throws IOException 
					{ 
						bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
						if (bytesRead == -1) 
							buffer[0] = -1; 
					} 
			  
					private byte read() throws IOException 
					{ 
						if (bufferPointer == bytesRead) 
							fillBuffer(); 
						return buffer[bufferPointer++]; 
					} 
			  
					public void close() throws IOException 
					{ 
						if (din == null) 
							return; 
						din.close(); 
					} 
				} 
}