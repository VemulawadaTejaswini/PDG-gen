import java.io.*;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) throws IOException {
        OutputStream out = new BufferedOutputStream(System.out);
        Scan scan = new Scan();
        int a = scan.scanInt();
        int b = scan.scanInt();
        int h = scan.scanInt();
        int m = scan.scanInt();
        int angle = calcAngle(h, m);
        //out.write((angle+"").getBytes());
        double dist=(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(angle));
        dist=Math.sqrt(dist);
        out.write((dist+"").getBytes());
        out.flush();
    }
    static int calcAngle(int h, int m)
    {
        if (h == 12)
            h = 0;
        if (m == 60)
            m = 0;


        // with reference to 12:00
        int hour_angle = (int) (0.5 * (h*60 + m));
        int minute_angle = 6*m;
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360-angle, angle);
        return angle;
    }
    private static class FastReader {
        final private int BUFFER_SIZE = 1 << 16;
        private byte[] buffer;
        private DataInputStream din;
        private int bufferPointer, bytesRead;

        public FastReader() {
            buffer = new byte[BUFFER_SIZE];
            din = new DataInputStream(System.in);
            bufferPointer = bytesRead = 0;
        }

        private String nextLine() throws IOException {
            StringBuilder sb = new StringBuilder();
            byte c;
            while ((c = read()) != -1 && c != '\n') {
                sb.appendCodePoint(c);
            }
            return sb.toString();
        }

        private int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = c == '-';
            if (neg) {
                c = read();
            }
            while (c >= '0' && c <= '9') {
                ret = ret * 10 + c - '0';
                c = read();
            }
            return (neg) ? -ret : ret;
        }

        private long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = c == '-';
            if (neg) {
                c = read();
            }
            while (c >= '0' && c <= '9') {
                ret = ret * 10 + c - '0';
                c = read();
            }
            return (neg) ? -ret : ret;
        }

        private double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = c == '-';
            if (neg) {
                c = read();
            }
            while (c >= '0' && c <= '9') {
                ret = ret * 10 + (c - '0');
                c = read();
            }
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            return (neg) ? -ret : ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

        private void close() throws IOException {
            if (din != null) {
                din.close();
            }
        }

    }

    private static class Scan {
        private byte[] buf = new byte[1024];
        private int index;
        private InputStream in;
        private int total;

        public Scan() {
            in = System.in;
        }

        public int scan() throws IOException {
            if (total < 0)
                throw new InputMismatchException();
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0)
                    return -1;
            }
            return buf[index++];
        }

        public int scanInt() throws IOException {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n))
                n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                } else throw new InputMismatchException();
            }
            return neg * integer;
        }

        public double scanDouble() throws IOException {
            double doub = 0;
            int n = scan();
            while (isWhiteSpace(n))
                n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n) && n != '.') {
                if (n >= '0' && n <= '9') {
                    doub *= 10;
                    doub += n - '0';
                    n = scan();
                } else throw new InputMismatchException();
            }
            if (n == '.') {
                n = scan();
                double temp = 1;
                while (!isWhiteSpace(n)) {
                    if (n >= '0' && n <= '9') {
                        temp /= 10;
                        doub += (n - '0') * temp;
                        n = scan();
                    } else throw new InputMismatchException();
                }
            }
            return doub * neg;
        }

        public String scanString() throws IOException {
            StringBuilder sb = new StringBuilder();
            int n = scan();
            while (isWhiteSpace(n))
                n = scan();
            while (!isWhiteSpace(n)) {
                sb.append((char) n);
                n = scan();
            }
            return sb.toString();
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
                return true;
            return false;
        }
    }
}
