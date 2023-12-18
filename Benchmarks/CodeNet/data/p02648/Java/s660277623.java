import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static class Vertex {
        int value, weight;
        Vertex parent;
        static final int length = 100;
        int[] memo = new int[length];

        Vertex(int V, int W, Vertex P) {
            value = V;
            weight = W;
            parent = P;
            for (int i = 0; i < length; i++)
                memo[i] = -1;
        }

        int dp(int l) {
            if (l < length && memo[l] != -1)
                return memo[l];
            int ret = 0;
            if (parent == null) {
                if (weight <= l) {
                    ret = value;
                }
            } else {
                if (weight <= l)
                    ret = Math.max(parent.dp(l), value + parent.dp(l - weight));
                else
                    ret = parent.dp(l);
            }
            if (l < length)
                memo[l] = ret;
            return ret;
        }
    }

    public static void main(String[] args) {
        int N = in.nextInt();
        List<Vertex> list = new ArrayList<>();
        list.add(new Vertex(in.nextInt(), in.nextInt(), null));
        for (int n = 1; n < N; n++)
            list.add(new Vertex(in.nextInt(), in.nextInt(), list.get((n-1)/2)));
        int Q = in.nextInt();
        for (int q = 0; q < Q; q++) {
            int v = in.nextInt() - 1;
            int L = in.nextInt();
            out.println(list.get(v).dp(L));
        }

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

