
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main{

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    static int s;

    public static void main(String[] args) throws Exception {
        while(true){
        	String str = sc.nextLine();
        	if(str.charAt(0)=='.'){
        		break;
        	}
        	s = 0;
        	int length = str.length();
        	boolean judge = true;
        	boolean[] flag = new boolean[length];
        	while(s<length){
        		if(str.charAt(s)=='('){
        			judge = func1(str,flag);
        			if(!judge){
        				break;
        			}
        		}
        		else if(str.charAt(s)=='['){
        			judge = func2(str,flag);
        			if(!judge){
        				break;
        			}
        		}
        		else if(str.charAt(s)==')' && !flag[s]){
        			judge = false;
        			break;
        		}
        		else if(str.charAt(s)==']' && !flag[s]){
        			judge = false;
        			break;
        		}
        		s++;
        	}
        	if(judge){
        		out.println("yes");
        	}
        	else{
        		out.println("no");
        	}
        	out.flush();
        }
        sc.close();
        out.close();
    }

    static boolean func1(String str,boolean[] flag){
    	s++;
    	int length = str.length();
    	while(s<length){
    		if(str.charAt(s)==')' && !flag[s]){
    			flag[s] = true;
    			return true;
    		}
    		else if(str.charAt(s)==']' && !flag[s]){
    			return false;
    		}
    		else if(str.charAt(s)=='['){
    			boolean judge = func2(str,flag);
    			if(!judge){
    				return false;
    			}
    		}
    		else if(str.charAt(s)=='('){
    			boolean judge = func1(str,flag);
    			if(!judge){
    				return false;
    			}
    		}
    		s++;
    	}
    	return false;
    }
    static boolean func2(String str,boolean[] flag){
    	s++;
    	int length = str.length();
    	while(s<length){
    		if(str.charAt(s)==']' && !flag[s]){
    			flag[s] = true;
    			return true;
    		}
    		else if(str.charAt(s)==')' && !flag[s]){
    			return false;
    		}
    		else if(str.charAt(s)=='('){
    			boolean judge = func1(str,flag);
    			if(!judge){
    				return false;
    			}
    		}
    		else if(str.charAt(s)=='['){
    			boolean judge = func2(str,flag);
    			if(!judge){
    				return false;
    			}
    		}
    		s++;
    	}
    	return false;	
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