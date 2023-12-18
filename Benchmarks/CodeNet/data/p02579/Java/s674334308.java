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
        int Ch = in.nextInt() - 1;
        int Cw = in.nextInt() - 1;
        int Dh = in.nextInt() - 1;
        int Dw = in.nextInt() - 1;
        int[][] grid = new int[H][W];
        for (int h = 0; h < H; h++) {
            String S = in.next();
            for (int w = 0; w < W; w++) {
                if (S.charAt(w) == '#')
                    grid[h][w] = -1;
                else
                    grid[h][w] = Integer.MAX_VALUE;
            }
        }
        Deque<Integer> Nh = new ArrayDeque<>();
        Deque<Integer> Nw = new ArrayDeque<>();
        Deque<Integer> Nd = new ArrayDeque<>();
        grid[Ch][Cw] = 0;
        Nh.addFirst(Ch);
        Nw.addFirst(Cw);
        Nd.addFirst(0);
        while (!Nh.isEmpty()) {
            int h = Nh.pollFirst();
            int w = Nw.pollFirst();
            int d = Nd.pollFirst();
            if (grid[h][w] != d)
                continue;
            if (h > 0 && grid[h - 1][w] > grid[h][w]) {
                grid[h - 1][w] = grid[h][w];
                Nh.addFirst(h - 1);
                Nw.addFirst(w);
                Nd.addFirst(grid[h][w]);
            }
            if (h < H - 1 && grid[h + 1][w] > grid[h][w]) {
                grid[h + 1][w] = grid[h][w];
                Nh.addFirst(h + 1);
                Nw.addFirst(w);
                Nd.addFirst(grid[h][w]);
            }
            if (w > 0 && grid[h][w - 1] > grid[h][w]) {
                grid[h][w - 1] = grid[h][w];
                Nh.addFirst(h);
                Nw.addFirst(w - 1);
                Nd.addFirst(grid[h][w]);
            }
            if (w < W - 1 && grid[h][w + 1] > grid[h][w]) {
                grid[h][w + 1] = grid[h][w];
                Nh.addFirst(h);
                Nw.addFirst(w + 1);
                Nd.addFirst(grid[h][w]);
            }
            for (int x = Math.max(0, h - 2); x <= h + 2 && x < H; x++)
                for (int y = Math.max(0, w - 2); y <= w + 2 && y < W; y++) {
                    if (grid[x][y] > grid[h][w] + 1) {
                        grid[x][y] = grid[h][w] + 1;
                        Nh.addLast(x);
                        Nw.addLast(y);
                        Nd.addLast(grid[h][w] + 1);
                    }
                }
        }
        if (grid[Dh][Dw] == Integer.MAX_VALUE)
            out.println(-1);
        else
            out.println(grid[Dh][Dw]);

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
