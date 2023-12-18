
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	String ans = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	while(true){
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		int q = sc.nextInt();
    		if(n==0 && m==0 && q==0){
    			break;
    		}
    		boolean[][] judge = new boolean[n][m];
            for(int i=0;i<n;i++){
                Arrays.fill(judge[i],true);
            }
            String[] s = new String[q];
            String[] b = new String[q];
            for(int i=0;i<q;i++){
                s[i] = sc.next();
                b[i] = sc.next();
            }
            boolean[] nows = new boolean[n];
            for(int i=0;i<q;i++){
                for(int j=0;j<n;j++){
                    if(s[i].charAt(j)=='1'){
                        nows[j] = !nows[j];
                    }
                    for(int k=0;k<m;k++){
                        if(nows[j] && b[i].charAt(k)=='0'){
                            judge[j][k] = false;
                        }
                        else if(!nows[j] && b[i].charAt(k)=='1'){
                            judge[j][k] = false;
                        }
                    }
                }
            }
            for(int i=0;i<m;i++){
                int flag = 0;
                int now = -1;
                for(int j=0;j<n;j++){
                    if(judge[j][i]){
                        flag++;
                        now = j;
                    }
                }
                if(flag==1){
                    out.print(ans.charAt(now));
                }
                else{
                    out.print("?");
                }
                out.flush();
            }
    	}

        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
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