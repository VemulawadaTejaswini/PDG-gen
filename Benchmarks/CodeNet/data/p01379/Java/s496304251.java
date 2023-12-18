import java.io.*;
import java.util.*;

public class Main {
    int H, W;

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, -1, 0, 1};

    void run() {
        H = readInt();
        W = readInt();
        char[][] M = new char[H][W];
        for (int i = 0; i < H; i++) {
            M[i] = read().toCharArray();
        }

        Queue<State> que = new ArrayDeque<State>();
        boolean[][][][] vis = new boolean[H][W][4][16];
        vis[0][0][0][0] = true;
        que.add(new State(0, 0, 0, 0));
        boolean end = false;
        while (!que.isEmpty()) {
            State s = que.poll();
            State next = null;

            // sysout.println(s);

            char c = M[s.y][s.x];

            if (c == '?') {
                for (int i = 0; i < 4; i++) {
                    next = s.updateDir(i);
                    next.move();
                    if (!vis[next.y][next.x][next.dir][next.mem]) {
                        vis[next.y][next.x][next.dir][next.mem] = true;
                        que.add(next);
                    }
                }
                continue;
            }

            if (c == '<') {
                next = s.updateDir(2);
            }
            if (c == '>') {
                next = s.updateDir(0);
            }
            if (c == '^') {
                next = s.updateDir(1);
            }
            if (c == 'v') {
                next = s.updateDir(3);
            }
            if (c == '_') {
                if (s.mem == 0) {
                    next = s.updateDir(0);
                } else {
                    next = s.updateDir(2);
                }
            }
            if (c == '|') {
                if (s.mem == 0) {
                    next = s.updateDir(3);
                } else {
                    next = s.updateDir(1);
                }
            }
            if (c == '@') {
                end = true;
                break;
            }
            if (Character.isDigit(c)) {
                int num = c - '0';
                next = s.updateMem(num);
            }
            if (c == '+') {
                next = s.updateMem(s.mem + 1);
            }
            if (c == '-') {
                next = s.updateMem(s.mem - 1);
            }
            if (c == '.') {
                next = s.updateMem(s.mem);
            }

            next.move();
            if (!vis[next.y][next.x][next.dir][next.mem]) {
                vis[next.y][next.x][next.dir][next.mem] = true;
                que.add(next);
            }
        }

        sysout.println(end ? "YES" : "NO");
    }

    class State {
        public int x, y, dir, mem;

        public State(int x, int y, int dir, int mem) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.mem = mem;
        }

        public State updateDir(int d) {
            return new State(x, y, d, mem);
        }

        @Override
        public String toString() {
            return "State{" +
                    "x=" + x +
                    ", y=" + y +
                    ", dir=" + dir +
                    ", mem=" + mem +
                    '}';
        }

        public void move() {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0) nx += W;
            if (ny < 0) ny += H;
            this.x = nx % W;
            this.y = ny % H;
        }

        public State updateMem(int m) {
            if (m < 0) m += 16;
            m %= 16;
            return new State(x, y, dir, m);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}