import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws Exception {
        StringBuilder sb = new StringBuilder();
        FastReader in = new FastReader(System.in);
        int i, j;
        boolean ok=false;
        int t=ok?in.nextInt():1;
        while(t-->0){
           int h1=in.nextInt();
           int m1=in.nextInt();
           int h2=in.nextInt();
           int m2=in.nextInt();
           int k=in.nextInt();
           int time=(60-m1) + (h2-h1-1)*60 +(m2);
           sb.append(time-k).append("\n");
        }
        System.out.print(sb);

    }
}

class FastReader {

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}
 
 