import java.util.*;
import java.io.*;

public class Main {

    private final static int[][] dirs = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private final static int P = 20;
    private final static int INF = (int)1e8;
    private int H, W, K;
    private char[][] A;

    public Main(FastScanner in, PrintWriter out) {
        H = in.nextInt();
        W = in.nextInt();
        K = in.nextInt();

        int[] st = new int[]{in.nextInt() - 1, in.nextInt() - 1};
        int[] target = new int[]{in.nextInt() - 1, in.nextInt() - 1};

        A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = in.next().toCharArray();
        }

        Map<Integer, Integer> seen = new HashMap<>();
        PriorityQueue<int[]> q= new PriorityQueue<>(
                Comparator.comparingInt(e -> (e[0] + K - 1) / K));
        for (int i = 0; i < 4; i++) {
            int loc = st[0] * W + st[1];
            seen.put((i << P) | loc, 0);
            q.add(new int[]{0, i, loc});
        }

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            int curDist = cur[0];
            int d = cur[1];
            int y = cur[2] / W, x = cur[2] % W;

            //out.println("========================");
            //out.printf("y=%d, x=%d, d=%d, dist=%d, cost=%d%n", y + 1, x + 1, d, curDist, (curDist + K - 1) / K);
            if (y == target[0] && x == target[1]) {

                //out.println("*************************");
                //List<int[]> l = new ArrayList<>();
                //for (var e : seen.entrySet()) {
                    //int key = e.getKey(), val = e.getValue();
                    //int dir = key >> P;
                    //int floc = (dir << P) ^ key;
                    //int fy = floc / W + 1, fx = floc % W + 1;
                    //l.add(new int[]{fy, fx, dir, val, (val + K - 1)/K});
                //}
                //Collections.sort(l, Comparator.<int[]>comparingInt(e->e[0]).thenComparingInt(e->e[1]).thenComparingInt(e->e[2]));
                //for (var tmp : l)
                    //out.println(Arrays.toString(tmp));
                //out.println("*************************");
                //out.println(curDist);
                out.println((curDist + K - 1) / K);
                return;
            }

            int ny = y + dirs[d][0];
            int nx = x + dirs[d][1];
            if (valid(ny, nx)) {
                int loc = ny * W + nx;
                int state = (d << P) | loc;
                int prevDist = seen.getOrDefault(state, INF);
                int newDist = curDist + 1;
                //if ((newDist + K - 1) / K < (prevDist + K - 1) / K) {
                if (newDist < prevDist) {
                    seen.put(state, newDist);
                    q.add(new int[]{newDist, d, loc});
                    //out.printf("continue: dir %d. dist %d -> %d%n", d, curDist, newDist);
                }
            }

            for (int i = 0; i < 4; i++) {
                if (i == d) continue;
                int loc = cur[2];
                int state = (i << P) | loc;
                int prevDist = seen.getOrDefault(state, INF);
                int newDist = (((curDist + K - 1) / K) * K);
                //if ((newDist + K - 1) / K < (prevDist + K - 1) / K) {
                if (newDist < prevDist) {
                    seen.put(state, newDist);
                    q.add(new int[]{newDist, i, loc});
                    //out.printf("rotate: dir %d -> %d. dist %d -> %d%n", d, i, curDist, newDist);
                }
            }
        }
        out.println(-1);
    }

    private boolean valid(int y, int x) {
        return y >= 0 && y < H && x >= 0 && x < W && A[y][x] == '.';
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
