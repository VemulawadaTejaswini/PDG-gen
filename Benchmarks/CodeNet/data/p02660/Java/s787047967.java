import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main{

    void solve(){
        long N = nl();
        if(N==1){
            out.println(0);
            out.flush();
            return;
        }
        int m = (int)Math.sqrt(N)+1;
        Sieve sieve = new Sieve(m);
        long count = 0;
        for (int i = 2; i <=m ; i++) {
            if(sieve.isPrime(i)){
                int val = i;
                while(N%val == 0){
                    count++;
                    N=N/i;
                    val *= i;
                }
            }
        }
        if(count == 0) count = 1;

        out.println(count);
        out.flush();
    } 


    public static void main(String[] args){
        Main m = new Main();
        m.solve();
    }

    Main(){
        this.scan = new FastScanner();
        this.out = new PrintWriter(System.out);
    }

    private FastScanner scan;
    private PrintWriter out;
    private final int MOD = 1_000_000_007;
    private final int INF = 2_147_483_647;
    private final long LINF = 9223372036854775807L;

    // Scanner
    int ni(){ return scan.nextInt();}
    int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
    int[][] ni(int y, int x){int[][] a = new int[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
    long nl(){return scan.nextLong();}
    long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
    long[][] nl(int y, int x){long[][] a = new long[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
    String ns(){return scan.next();}
    String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
    String[][] ns(int y, int x){String[][] a = new String[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
}
class Sieve {
    private int n;
    private int[] f;
    public ArrayList<Integer> primes = new ArrayList<>();
    public Sieve(int N){
        n = N;
        f = new int[n+1];
        f[0] = -1; // 0 is not prime
        f[1] = -1; // 1 is not prime
        for(int i = 2; i <= N; i++){
            if(f[i]!=0) continue;
            primes.add(i);
            f[i] = i;
            for(int j = i+i; j<=n; j+=i){
                if(f[j]==0) f[j] = i;
            }
        }
    }
    public boolean isPrime(int i){
        return (f[i]==i);
    } 
    public ArrayList<Integer> factorList(int i){
        ArrayList<Integer> res = new ArrayList<>();
        while(i != 1){
            res.add(f[i]);
            i /= f[i];
        }
        return res;
    }
    public HashMap<Integer, Integer> factorCount(int i){
        HashMap<Integer, Integer> res = new HashMap<>();
        while(i != 1){
            res.putIfAbsent(f[i], 0);
            res.put(f[i], res.get(f[i]) + 1);
            i /= f[i];
        }
        return res;
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
