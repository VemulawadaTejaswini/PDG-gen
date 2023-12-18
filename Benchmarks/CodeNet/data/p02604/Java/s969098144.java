import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
    static int N;
    static int[] X,Y,P;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = (int)sc.nextLong();
        X = new int[N];
        Y = new int[N];
        P = new int[N];
        Set<Integer> xset = new HashSet<>();
        Set<Integer> yset = new HashSet<>();
        for (int i=0; i<N; i++) {
            X[i] = (int)sc.nextLong();
            Y[i] = (int)sc.nextLong();
            P[i] = (int)sc.nextLong();
            if (X[i] != 0) xset.add(X[i]);
            if (Y[i] != 0) yset.add(Y[i]);
        }
        Integer[] xl = xset.toArray(new Integer[xset.size()]);
        Integer[] yl = yset.toArray(new Integer[yset.size()]);

        int[][] xcost = new int[N][1<<xl.length];
        int[][] ycost = new int[N][1<<yl.length];
        for(int i=0; i<N; i++) {
            for(int b=0; b<(1<<xl.length); b++) {
                int d = Math.abs(X[i]);
                for(int k=0; k<xl.length; k++) {
                    if((b&(1<<k)) > 0)
                        d = Math.min(d, Math.abs(X[i] - xl[k]));
                }
                xcost[i][b] = d*P[i];
            }
            for(int b=0; b<(1<<yl.length); b++) {
                int d = Math.abs(Y[i]);
                for(int k=0; k<yl.length; k++) {
                    if((b&(1<<k)) > 0)
                        d = Math.min(d, Math.abs(Y[i] - yl[k]));
                }
                ycost[i][b] = d*P[i];
            }
        }

        List<Integer>[] xk = new List[N+1];
        for(int i=0; i<=N; i++) xk[i] = new ArrayList<>();
        List<Integer>[] yk = new List[N+1];
        for(int i=0; i<=N; i++) yk[i] = new ArrayList<>();
        for(int b=0; b<(1<<xl.length); b++) {
            int c = Integer.bitCount(b);
            if (c > N) continue;
            xk[c].add(b);
        }
        for(int b=0; b<(1<<yl.length); b++) {
            int c = Integer.bitCount(b);
            if (c > N) continue;
            yk[c].add(b);
        }

        for (int k=0; k<=N; k++) {
            if(k >= xl.length || k >= yl.length) {
                System.out.println(0);
                continue;
            }
            int ans = Integer.MAX_VALUE;
            for(int xc = 0; xc <= k; xc++) {
                int yc = k - xc;
                for(int xb: xk[xc]) {
                    for(int yb: yk[yc]) {
                        int cost = 0;
                        for(int i=0; i<N; i++) {
                            cost += Math.min(xcost[i][xb], ycost[i][yb]);
                            if(cost >= ans) break;
                        }
                        ans = Math.min(ans, cost);
                    }
                }
            }
            System.out.println(ans);
        }
    }





    //https://qiita.com/p_shiki37/items/65c18f88f4d24b2c528b
    static class FastScanner {
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
        private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    }
}
