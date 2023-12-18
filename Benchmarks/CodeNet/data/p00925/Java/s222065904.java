
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	
    	String s = sc.next();
    	int ans = sc.nextInt();
    	int l = 0;
    	int m = 0;
    	int left = 0;
    	int a = 0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)>='0' && s.charAt(i)<='9'){

    		}
    		else{
    			int x = 0;
    			for(int j=left;j<i;j++){
    				x += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j-1);
    			}
    			if(a==0){
    				l += x;
    			}
    			else{
    				l *= x;
    			}
    			if(s.charAt(i)=='*'){
    				a = 1;
    			}
    			else if(s.charAt(i)=='+'){
    				a = 0;
    			}
    			left = i+1;
    		}
    		if(i==s.length()-1){
    			int x = 0;
    			for(int j=left;j<s.length();j++){
    				x += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j);
    			}
    			if(a==0){
    				l += x;
    			}
    			else{
    				l *= x;
    			}
    		}
    	}
    	left = 0;
    	a = 0;
    	int y = 0;
    	int z = 0;
    	int ll = 0;
    	ArrayList<func> list = new ArrayList<func>();
    	boolean[] flag = new boolean[s.length()];
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='*'){
    			if(a==1){
    				z = 0;
    				for(int j=left;j<i;j++){
    					z += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j-1);
    				}
    				y *= z;
    			}
    			else{
	    			for(int j=left;j<i;j++){
    					y += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j-1);
    				}
    				ll = left;
    			}
    			left = i+1;
    			a = 1;
    		}
    		else if(s.charAt(i)=='+'){
    			if(a==1){
    				z = 0;
    				for(int j=left;j<i;j++){
    					z += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j-1);
    				}
    				y *= z;
    				func w = new func(ll,i-1,y);
    				list.add(w);
    				flag[ll] = true;
    				y = 0;
    				ll = 0;
    			}
    			left = i+1;
    			a = 0;
    		}
    		if(i==s.length()-1 && a==1){
    			z = 0;
    			for(int j=left;j<s.length();j++){
    				z += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j);
    			}
    			y *= z;
    			func w = new func(ll,s.length()-1,y);
    			list.add(w);
    			flag[ll] = true;
    		}
    	}
    	left = 0;
    	int count = 0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='+'){
    			z = 0;
    			if(flag[left]){
    				func w = list.get(count);
    				z = w.an;
    				count++;
    			}
    			else{
    				for(int j=left;j<i;j++){
    					z += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j-1);
    				}
    			}
    			m += z;
    			left = i+1;
    		}
    		if(i==s.length()-1){
    			z = 0;
    			if(flag[left]){
    				func w = list.get(count);
    				z = w.an;
    			}
    			else{
    				for(int j=left;j<s.length();j++){
    					z += ((int)s.charAt(j)-(int)'0')*(int)Math.pow(10,i-j);
    				}
    			}
    			m += z;
    		}
    	}
    	if(ans==l && ans==m){
    		out.println("U");
    	}
    	else if(ans==l){
    		out.println("L");
    	}
    	else if(ans==m){
    		out.println("M");
    	}
    	else{
    		out.println("I");
    	}
    	out.flush();
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class func {
	int ll = 0;
	int rr = 0;
	int an = 0;
	func(int ll,int rr,int an){
		this.ll = ll;
		this.rr = rr;
		this.an = an;
	}
}

class Reader {

    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.in = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = in.read(buf);
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

    public void close() {try{ in.close();}catch(IOException e){ e.printStackTrace();}};
}