import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
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
public class Main {
    static int[] pre;
    static int[] in;
static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        FS sc = new FS();
        int n = sc.nextInt();
        pre = new int[n];
        in = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextInt();
        }
        separate(0,n-1,0,n-1);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

    private static void separate(int i, int j,int i1,int j1) {
        if (i>j||i1>j1)return;
        sb.insert(0,pre[i]+" ");
        if (i==j||i1==j1)return;
        int start =i+1;
        int m=i1;
        while (in[m]!=pre[i]){
            m++;
        }
        int prelength =  m-i1;
        int postlength = j1 - m;
        separate(i+prelength+1,j,m+1,j1);
        separate(start,i+prelength,i1,m-1);
    }
}
