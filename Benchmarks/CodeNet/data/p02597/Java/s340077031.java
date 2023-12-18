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
            byte[] buf = new byte[(int) (2e6+10)]; // line length 
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

	public static List<Integer>[] edges;
	
	public static void main(String[] args) throws IOException{
	int n = sc.nextInt();
	char[] s = sc.readLine().trim().toCharArray();
	int r = 0;
	for(char x : s) if(x == 'R') ++r;
	int ans = r;
	for(int i=0;i<r;++i) {
		if(s[i] == 'R') --ans;
	}
	out.print(ans);
	

	out.close();
	}

	private static int solve(char[] s, char W, char R) {

		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<s.length;++i) if(s[i] == 'W') set.add(i);
		int ans = 0;
		for(int i=0;i<s.length;++i) {
			if(s[i] == 'W') continue;
			if(s[i] == 'R' && set.size() > 0) {
				int pos = set.first();
				if(pos+1 != i) {
					char c = s[pos];
					s[pos] = s[i];
					s[i] = c;
					set.remove(pos);
					set.add(i);
					++ans;
				}
			}
		}
//		out.print(ans);
//		out.print(new String(s));
		for(int i=1;i<s.length;++i) {
			if(s[i] == 'R' && s[i-1] == 'W') {
				s[i] = 'W';
				++ans;
			}
		}
		return ans;
	}

	
}