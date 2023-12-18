
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int k = fs.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            a[i] = fs.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = fs.nextInt();
        }
        long sum = 0;
        int aidx = 0;
        int bidx = 0;
        int count = 0;
        while(aidx < n || bidx < m){
            if(aidx < n && bidx < m){
                if(a[aidx] <= b[bidx]){
                    if(sum+a[aidx] <=k){

                        sum+=a[aidx];
                        count++;
                        aidx++;
                    }else{
                        break;
                    }
                }else{
                    if(sum+b[bidx]<=k){

                        sum+=b[bidx];
                        count++;
                        bidx++;
                    }else{
                        break;
                    }
                }
            }else if(aidx < n){
                if(sum+a[aidx] <=k){

                    sum+=a[aidx];
                    count++;
                    aidx++;
                }else{
                    break;
                }
            }else{
                if(sum+b[bidx]<=k){

                    sum+=b[bidx];
                    count++;
                    bidx++;
                }else{
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
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

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

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
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}