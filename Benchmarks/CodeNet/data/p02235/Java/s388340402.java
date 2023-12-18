import java.util.*;
import java.io.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int query = sc.nextInt();
        
    	for(int t=0; t<query; t++){
    	    String a =sc.next();
    	    String b =sc.next();
    	    
    	    int[][] dp = new int[a.length()+1][b.length()+1];   //aのi文字目、bのj文字目までのLCS
    	    
    	    for(int i=0; i<=a.length(); i++){
    	        dp[i][0] = 0;
    	    }
    		for(int j=1; j<=b.length(); j++){
    	        dp[0][j] = 0;
    		}
    		
    	    for(int i=1; i<=a.length(); i++){
    		    for(int j=1; j<=b.length(); j++){
    		        if(a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = max2(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]+1);
    		        else dp[i][j] = max2(dp[i-1][j], dp[i][j-1]);
    		    }
    	    }
    	    
            out.println(dp[a.length()][b.length()]);
    	}
        out.flush();
    }
    
    private static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    private static int max2(int... ins){
        int max = ins[0];
        
    	for(int i=1; i<ins.length; i++){
    	    if(ins[i] > max) max = ins[i];
    	}
    	return max;
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
    
    public static void combSort(int[][] origin, int ln){
        int h=ln*10/13, tmp=0;
        boolean fin=true;
        while((h>1)||(!fin)){
            fin=true;
            for(int i=0; i < ln-h; i++){
                if(origin[i][0] > origin[i+h][0]){
                    tmp=origin[i][0];
                    origin[i][0]=origin[i+h][0];
                    origin[i+h][0]=tmp;
                    tmp=origin[i][1];
                    origin[i][1]=origin[i+h][1];
                    origin[i+h][1]=tmp;
                    fin=false;
                }
            }
            h *=10;
            h/=13;
        }
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
