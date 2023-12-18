
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
        
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int[] m = new int[n+1];
            int[][][] point = new int[n+1][11][2];
            for(int i=0;i<=n;i++){
                m[i] = sc.nextInt();
                for(int j=0;j<m[i];j++){
                    point[i][j][0] = sc.nextInt();
                    point[i][j][1] = sc.nextInt();
                }
            }
            int[][] length = new int[n+1][11];
            int[][] angle = new int[n+1][11];
            int[][] rangle = new int[n+1][11];
            for(int i=0;i<=n;i++){
                for(int j=0;j<m[i]-1;j++){
                    length[i][j] = len(point[i][j][0],point[i][j][1],point[i][j+1][0],point[i][j+1][1]);
                    if(j!=0){
                        angle[i][j-1] = ang(point[i][j-1][0],point[i][j-1][1],point[i][j][0],point[i][j][1],
                            point[i][j+1][0],point[i][j+1][1]);
                        rangle[i][j-1] = ang(point[i][m[i]-j][0],point[i][m[i]-j][1],point[i][m[i]-j-1][0],
                            point[i][m[i]-j-1][1],point[i][m[i]-j-2][0],point[i][m[i]-j-2][1]); 
                    }
                }
            }
            boolean[] judge = new boolean[n+1];
            for(int i=1;i<=n;i++){
                if(m[0]!=m[i]){
                    continue;
                }
                boolean flag = true;
                for(int j=0;j<m[i]-1;j++){
                    if(length[0][j]!=length[i][j]){
                        flag = false;
                    }
                    if(j!=0){
                        if(angle[0][j-1]!=angle[i][j-1]){
                            flag = false;
                        }
                    }
                }
                if(flag){
                    judge[i] = true;
                }
                flag = true;
                for(int j=0;j<m[i]-1;j++){
                    if(length[0][j]!=length[i][m[i]-j-2]){
                        flag = false;
                    }
                    if(j!=0){
                        if(angle[0][j-1]!=rangle[i][j-1]){
                            flag = false;
                        }
                    }
                }
                if(flag){
                    judge[i] = true;
                }
                flag = true;
                for(int j=0;j<m[i]-1;j++){
                    if(length[0][m[i]-j-2]!=length[i][j]){
                        flag = false;
                    }
                    if(j!=0){
                        if(rangle[0][j-1]!=angle[i][j-1]){
                            flag = false;
                        }
                    }
                }
                if(flag){
                    judge[i] = true;
                }
            }
            for(int i=1;i<=n;i++){
                if(judge[i]){
                    out.println(i);
                }
            }
            out.println("+++++");
            out.flush();
        }
        sc.close();
        out.close();
    }

    static int len(int x,int y,int xx,int yy){
        return (Math.abs(x-xx)+Math.abs(y-yy));
    }

    static int ang(int x,int y,int xx,int yy,int xxx,int yyy){
        if((x<xx && yy<yyy) || (y<yy && xx>xxx) || (x>xx && yy>yyy) || (y>yy && xx<xxx)){
            return 1;
        }
        return 0;
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