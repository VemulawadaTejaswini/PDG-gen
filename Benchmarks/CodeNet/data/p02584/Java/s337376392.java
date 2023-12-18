import java.util.*;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;

public class Main {


    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];

        private int curChar;

        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String readString() {
            final StringBuilder stringBuilder = new StringBuilder();
            int c = read();
            while (isSpaceChar(c))
                c = read();
            do {
                stringBuilder.append(c);
                c = read();
            } while (!isSpaceChar(c));
            return stringBuilder.toString();
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }


    public static void main(String[] args) throws IOException {

        InputReader bf = new InputReader(System.in);
        long t = bf.readLong();
        long d = bf.readLong();
        long x= bf.readLong();

        Set<Long> set = new HashSet();
        int min = Integer.MAX_VALUE;
        while(d != 0){

            if( (!set.isEmpty() && set.contains(t) && d%2 == 0)){
                break;
            }

            long a = t-x;
            long b = t+x;

            if(Math.abs(a) < Math.abs(b)){
                t-=x;
            }else if(Math.abs(a) >= Math.abs(b)){
                t+=x;
            }
            d--;
            set.add(t);
        }

        System.out.println(Math.abs(t));
    }

}

