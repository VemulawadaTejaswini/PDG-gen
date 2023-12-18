import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;




public class Main {
	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
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

	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static Reader sc = new Reader();
 
	static int mod = (int)(1e9+7),MAX=(int)(2e6+10);

	public static void main(String[] args) throws IOException{

		int N = sc.nextInt();
		int[] lpf = new int[(int) (N+1)];
		for(int i=0;i<lpf.length;++i) lpf[i] = i;
		build(lpf);
		long ans = 0;
		for(int k = 1;k<=N;++k){
			TreeMap<Integer,Integer> map = new TreeMap<>();
			int n = k;
			while(n>1) {
				add(map,lpf[n]);
				n/=lpf[n];
				
			}
			// sum of divisors
			long fac = k;
			for(int key : map.keySet()) {
				fac = fac*(map.get(key)+1);
			}
			ans += fac;
		}
		out.print(ans);
	        out.close();
	}
	
		private static void add(TreeMap<Integer, Integer> map, int i) {
			// TODO Auto-generated method stub
			if(map.containsKey(i)) map.put(i, map.get(i)+1);
			else map.put(i, 1);
			
		}
	private static void build(int[] lpf) {
		// put the minimum divisor instead of crossing it
		int n = lpf.length-1;
		lpf[0] = 0;
		lpf[1] = 1;
		for(int i =2;i*i<=n;++i) {
			if(lpf[i]>=i) {
			lpf[i] = Math.min(lpf[i], i);
			for(int j=i*i;j<=n;j+=i) {
				lpf[j] = Math.min(lpf[j], i);
			}
		  }
		}
		
		// for(int i = 1060 ;i<=1070;++i) System.out.print(lpf[i]+" ");
	}

}