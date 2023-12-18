
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
        while(true){
        	int h = sc.nextInt();
        	if(h==0){
        		break;
        	}
        	ArrayList<Integer> list1 = new ArrayList<Integer>();
        	ArrayList<Integer> list2 = new ArrayList<Integer>();
        	ArrayList<Integer> list3 = new ArrayList<Integer>();
        	ArrayList<Integer> list4 = new ArrayList<Integer>();
        	ArrayList<Integer> list5 = new ArrayList<Integer>();
        	for(int i=0;i<=h;i++){
        		list1.add(-1);
        		list2.add(-2);
        		list3.add(-3);
        		list4.add(-4);
        		list5.add(-5);
        	}
        	for(int i=0;i<h;i++){
        		list1.set(h-i-1,sc.nextInt());
        		list2.set(h-i-1,sc.nextInt());
        		list3.set(h-i-1,sc.nextInt());
        		list4.set(h-i-1,sc.nextInt());
        		list5.set(h-i-1,sc.nextInt());
        	}
        	int ans = 0;
        	while(true){
        		boolean judge = false;
        		for(int i=h-1;i>=0;i--){
        			int a;
        			int b;
        			int c;
        			int d;
        			int e;
        			if(i<list1.size()){
        				a = list1.get(i);
        			}
        			else{
        				a = -1;
        			}
        			if(i<list2.size()){
        				b = list2.get(i);
        			}
        			else{
        				b = -2;
        			}
        			if(i<list3.size()){
        				c = list3.get(i);
        			}
        			else{
        				c = -3;
        			}
        			if(i<list4.size()){
        				d = list4.get(i);
        			}
        			else{
        				d = -4;
        			}
        			if(i<list5.size()){
        				e = list5.get(i);
        			}
        			else{
        				e = -5;
        			}
        			if(a==b && b==c){
        				if(c==d && d==e){
        					ans += 2*d;
        					list4.remove(i);
        					list5.remove(i);
        				}
        				else if(c==d){
        					ans += d;
        					list4.remove(i);
        				}
        				ans += 3*a;
        				list1.remove(i);
        				list2.remove(i);
        				list3.remove(i);
        				judge = true;
        			}
        			else if(b==c && c==d){
        				if(d==e){
        					ans += e;
        					list5.remove(i);
        				}
        				ans += 3*b;
        				list2.remove(i);
        				list3.remove(i);
        				list4.remove(i);
        				judge = true;
        			}
        			else if(c==d && d==e){
        				ans += 3*c;
        				list3.remove(i);
        				list4.remove(i);
        				list5.remove(i);
        				judge = true;
        			}
        		}
        		if(!judge){
        			break;
        		}
        	}
        	out.println(ans);
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