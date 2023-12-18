
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main{

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
        double mn = Math.pow(10,-5);
        while(true){
        	int n = sc.nextInt();
        	if(n==0){
        		break;
        	}
        	String[] l = new String[n];
        	int[] p = new int[n];
        	int[] a = new int[n];
        	int[] b = new int[n];
        	int[] c = new int[n];
        	int[] d = new int[n];
        	int[] e = new int[n];
        	int[] f = new int[n];
        	int[] s = new int[n];
        	int[] m = new int[n];
        	for(int i=0;i<n;i++){
        		l[i] = sc.next();
        		p[i] = sc.nextInt();
        		a[i] = sc.nextInt();
        		b[i] = sc.nextInt();
        		c[i] = sc.nextInt();
        		d[i] = sc.nextInt();
        		e[i] = sc.nextInt();
        		f[i] = sc.nextInt();
        		s[i] = sc.nextInt();
        		m[i] = sc.nextInt();
        	}

        	int[] sum = new int[n];
        	int[] time = new int[n];
        	double[] ans = new double[n];
        	for(int i=0;i<n;i++){
        		for(int j=0;j<m[i];j++){
	        		if(j==0){
    	    			time[i] += (a[i] + b[i] + c[i]);
        			}
        			time[i] += (d[i]+e[i]);
        			if(sum[i]==0){
        				sum[i] = f[i];
        			}
        			else{
	        			sum[i] += sum[i]*f[i];
	        		}
        			if(j==m[i]-1){
        				ans[i] = ((double)sum[i]*s[i]-(double)p[i])/(double)time[i];
        			}
        		}
        	}

        	for(int i=0;i<n;i++){
        		for(int j=i+1;j<n;j++){
        			if(ans[i]<ans[j] || (Math.abs(ans[i]-ans[j])<mn && l[i].compareTo(l[j])>0)){
        				double x = ans[i];
        				ans[i] = ans[j];
        				ans[j] = x;
        				String y = l[i];
        				l[i] = l[j];
        				l[j] = y;
        			}
        		}
        	}

        	for(int i=0;i<n;i++){
        		out.println(l[i]);
        	}
        	out.println("#");
        	out.flush();
        }
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Reader {
    private final InputStream sc;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.sc = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = sc

.read(buf);
        }catch (IOException e) {e.printStackTrace();}
        if (buflen <= 0) return false;
        return true;
    }

    private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

    private void skip() { while(hasNextByte() && !isPrintableChar(buf[ptr])) ptr++;}

    public boolean hasNext() {skip(); return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        boolean minus = false;
        long num = readByte();

        if(num == '-'){
            num = 0;
            minus = true;
        }else if (num < '0' || '9' < num){
            throw new NumberFormatException();
        }else{
            num -= '0';
        }
        
        while(true){
            int b = readByte();
            if('0' <= b && b <= '9')
                num = num * 10 + (b - '0');
            else if(b == -1 || !isPrintableChar(b))
                return minus ? -num : num;
            else
                throw new NoSuchElementException();
        }
    }

    public int nextInt() {
        long num = nextLong();
        if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
            throw new NumberFormatException();
        return (int)num;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public char nextChar() {
        if (!hasNext()) throw new NoSuchElementException();
        return (char)readByte();
    }

    public String nextLine() {
        while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
        if (!hasNextByte()) throw new NoSuchElementException();

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (b != '\n' && b != '\r') {
            sb.appendCodePoint(b);
            b = readByte();
        }

        return sb.toString();
    }

    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) res[i] = nextInt();
        return res;
    }

    public char[] nextCharArray(int n) {
        char[] res = new char[n];
        for (int i=0; i<n; i++) res[i] = nextChar();
        return res;
    }

    public void close() {try{ sc.close();}catch(IOException e){ e.printStackTrace();}};
}