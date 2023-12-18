import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int H = in.nextInt();
        int W = in.nextInt();
        int M = in.nextInt();
        int[] Bh = new int[H];
        int[] Bw = new int[W];
        Set<Long> set = new HashSet<>();
        for (int m = 0; m < M; m++) {
            int h = in.nextInt() - 1;
            int w = in.nextInt() - 1;
            Bh[h]++;
            Bw[w]++;
            set.add((long) h * 1000000 + w);
        }
        int Mh = 0;
        Set<Integer> Mhh = new HashSet<>();
        for (int h = 0; h < H; h++) {
            if (Mh == Bh[h]) {
                Mhh.add(h);
            } else if (Mh < Bh[h]) {
                Mh = Bh[h];
                Mhh.clear();
                Mhh.add(h);
            }
        }
        int Mw = 0;
        Set<Integer> Mww = new HashSet<>();
        for (int w = 0; w < W; w++) {
            if (Mw == Bw[w]) {
                Mww.add(w);
            } else if (Mw < Bw[w]) {
                Mw = Bw[w];
                Mww.clear();
                Mww.add(w);
            }
        }
        boolean b = false;
        for (int h : Mhh) {
            for (int w : Mww) {
                b = !set.contains((long) h * 1000000 + w);
                if (b) break;
            }
            if (b) break;
        }
        if (b)
            out.println(Mh + Mw);
        else
            out.println(Mh + Mw - 1);

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
