import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= fs.nextInt();
        }
        int p = partition(a, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<a.length;i++){
            if (i==p){
                sb.append("["+a[i]+"] ");
                continue;
            }
            sb.append(a[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

    private static int  partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p-1;
        for (int j =p;j<r;j++){
            if (a[j]<x){
                i++;
                exchange(a,j,i);
            }
        }
        exchange(a,i+1,r);
        return i+1;
    }

    private static void exchange(int[] a,int i, int j) {
        int tep = a[j];
        a[j]=a[i];
        a[i]=tep;
    }
  static  class FS {
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
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
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

    public int nextInt() {
        return (int) nextLong();
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
}
}
