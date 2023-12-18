import java.util.*;
import java.io.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int w = sc.nextInt();
        
        int[] value = new int[n];
        int[] w_each = new int[n];
        
    	for(int i=0; i<n; i++){
    	    value[i] = sc.nextInt();
    	    w_each[i] = sc.nextInt();
    	}
        
        int[][] dp = new int[n+1][w+1];
        
        for(int j=0; j<w; j++){
            dp[0][j] = 0;
        }
        
    	for(int i=0; i<n; i++){
    		for(int j=0; j<=w; j++){
    		    if(j >= w_each[i]) dp[i+1][j] = max(dp[i][j-w_each[i]] + value[i], dp[i][j]);
    		    else dp[i+1][j] = dp[i][j];
    		}
    	}
        //show_i2d_array(dp);
        out.println(dp[n][w]);
        out.flush();
    }
    
    private static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    
    
    static void show_i2d_array(int[][] dt){
        PrintWriter out = new PrintWriter(System.out);
    	for(int i=0; i<dt[0].length; i++){
    		for(int j=0; j<dt.length; j++){
    		    out.print(dt[j][i]+",");
    		}
    		out.println("<-w="+i);
    	}
    	out.flush();
    }
}
 
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
