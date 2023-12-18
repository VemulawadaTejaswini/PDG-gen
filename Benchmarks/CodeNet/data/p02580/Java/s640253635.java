import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FastScanner scanner = new FastScanner();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<Integer, Integer> hMap = new HashMap<>();
        HashMap<Integer, Integer> wMap = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int hv = scanner.nextInt();
            Integer nh = hMap.get(hv);
            if (nh == null) {
                nh = 0;
            }
            hMap.put(hv, ++nh);
            int wv = scanner.nextInt();
            Integer nw = wMap.get(wv);
            if (nw == null) {
                nw = 0;
            }
            wMap.put(wv, ++nw);
            map.computeIfAbsent(hv, integer -> new ArrayList<>()).add(wv);
        }

        // sort
        ArrayList<Point> hMaxOrder = new ArrayList<>();
        ArrayList<Point> wMaxOrder = new ArrayList<>();

        for (Integer key: hMap.keySet()
             ) {
            hMaxOrder.add(new Point(key, hMap.get(key)));
        }
        for (Integer key: wMap.keySet()
        ) {
            wMaxOrder.add(new Point(key, wMap.get(key)));
        }
        hMaxOrder.sort(Comparator.comparingInt(point -> point.y));
        wMaxOrder.sort(Comparator.comparingInt(point -> point.y));

        int ans = 0;

        for (int i = hMaxOrder.size() - 1; i >= 0; i--) {
            Point hp = hMaxOrder.get(i);
            if (ans > 0 && hMaxOrder.get(i + 1).y != hp.y) {
                break;
            }
            for (int j = wMaxOrder.size() - 1; j >=  0; j--) {
                Point wp = wMaxOrder.get(j);
                int v = hp.y + wp.y;
                if (ans > 0 && v <= ans) {
                    break;
                }
                if (map.get(hp.x).contains(wp.x)) {
                    v--;
                } else {
                    System.out.println(v);
                    return;
                }
                ans = Math.max(v, ans);
            }
        }

        System.out.println(ans);
    }

    private static class FastScanner {
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

        private static boolean isPrintableChar(int c) {
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