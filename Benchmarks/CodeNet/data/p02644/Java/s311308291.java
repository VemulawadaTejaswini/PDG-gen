import java.util.*;
import java.io.*;

public class Main {

    private static final int INF = (int)1e8;

    public Main(FastScanner in, PrintWriter out) {
        int H = in.nextInt();
        int W = in.nextInt();
        int K = in.nextInt();

        int[] st = new int[]{in.nextInt() - 1, in.nextInt() - 1};
        int[] target = new int[]{in.nextInt() - 1, in.nextInt() - 1};


        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = in.next().toCharArray();
        }

        TreeSet<Integer>[] rows = new TreeSet[H];
        for (int i = 0; i < H; i++) {
            rows[i] = new TreeSet();
            for (int j = 0; j < W; j++) {
                rows[i].add(j);
            }
        }
        rows[st[0]].remove(st[1]);

        TreeSet<Integer>[] cols = new TreeSet[W];
        for (int j = 0; j < W; j++) {
            cols[j] = new TreeSet();
            for (int i = 0; i < H; i++) {
                cols[j].add(i);
            }
        }
        cols[st[1]].remove(st[0]);

        int[] dist = new int[H * W];
        Arrays.fill(dist, INF);

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(st[0] * W + st[1]);
        dist[st[0] * W + st[1]] = 0;

        while (!q.isEmpty()) {
            int cell = q.remove(), y = cell / W, x = cell % W;
            if (y == target[0] && x == target[1]) {
                out.println(dist[cell]);
                return;
            }

            TreeSet<Integer> curRow = rows[y], curCol = cols[x];

            //out.println("================================");
            //out.printf("y=%d, x=%d%n", y, x);
            //out.println(curRow);
            //out.println(curCol);

            int l = Math.max(0, x - K);
            int r = Math.min(W - 1, x + K);
            int lx = x, rx = x;
            for (int nx : curRow.subSet(l, true, x, true).descendingSet()) {
                if (A[y][nx] == '@') break;
                lx = nx;
                int ncell = y * W + nx;
                dist[ncell] = dist[cell] + 1;
                cols[nx].remove(y);
                q.offer(ncell);
            }
            for (int nx : curRow.subSet(x, true, r, true)) {
                if (A[y][nx] == '@') break;
                rx = nx;
                int ncell = y * W + nx;
                dist[ncell] = dist[cell] + 1;
                cols[nx].remove(y);
                q.offer(ncell);
            }
            curRow.subSet(lx, rx + 1).clear();

            int top = Math.max(0, y - K);
            int bot = Math.min(H - 1, y + K);
            int ty = y, by = y;
            for (int ny : curCol.subSet(top, true, y, true).descendingSet()) {
                if (A[ny][x] == '@') break;
                ty = ny;
                int ncell = ny * W + x;
                dist[ncell] = dist[cell] + 1;
                rows[ny].remove(x);
                q.offer(ncell);
            }
            for (int ny : curCol.subSet(y, true, bot, true)) {
                if (A[ny][x] == '@') break;
                by = ny;
                int ncell = ny * W + x;
                dist[ncell] = dist[cell] + 1;
                rows[ny].remove(x);
                q.offer(ncell);
            }
            curCol.subSet(ty, by + 1).clear();
        }
        out.println(-1);

    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);

        out.close();
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
