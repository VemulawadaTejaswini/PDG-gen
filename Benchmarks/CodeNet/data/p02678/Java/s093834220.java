import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static final long MOD = 1000000007;
    public static final int INF = 1 << 15;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        Integer i,j,k,n=0,m=0,h=0,w=0;
        long a=0,b=0,c=0,x=0,y=0,z=0,ans=0;

        n = sc.nextInt();
        m = sc.nextInt();

        boolean[][] f = new boolean[n+1][n+1];

        int[][] anslist = new int[n+1][2];

        for(i=2;i<n+1;i++){
            anslist[i][0]=0;
            anslist[i][1]=0;
        }

        for(i=0;i<m;i++){
            h=sc.nextInt();
            w=sc.nextInt();
            f[h][w]=true;
            f[w][h]=true;
        }

        for(i=2;i<n+1;i++){
            if(f[1][i]){
                anslist[i][0] = 1;
                anslist[i][1] = 1;
            }
        }

        boolean change = true;

        do{
            change = false;
            for(i=2;i<n+1;i++){
                if(anslist[i][0]==0){
                    for(j=2;j<n+1;j++){
                        if(f[i][j] && anslist[j][0]!=0){
                            change=true;
                            anslist[i][1]=j;
                            break;
                        }
                    }                    
                }
            }

            for(i=2;i<n+1;i++){
                anslist[i][0]=anslist[i][1];
            }

        }while(change);

        for(i=2;i<n+1;i++){
            if(anslist[i][0]==0){
                print("No");
                return;
            }
        }

        print("Yes");
        for(i=2;i<n+1;i++){
            print(anslist[i][0]);
        }
    }

    private static void print(Object o) {
        System.out.println(o.toString());
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static class Pair {
        private int key;
        private int value;

        public Pair(int key, int value){
            this.key=key;
            this.value=value;
        }

        public int getValue(){
            return this.value;
        }

        public int getKey(){
            return this.key;
        }

        public void setValue(int value){
            this.value = value;
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
