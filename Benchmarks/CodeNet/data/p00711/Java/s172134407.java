import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    ArrayList<Board> bs;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        String line;
        char[] ls;
        String[] elems;
        bs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while ((line = br.readLine()) != null && !line.equals("")) {
                elems = line.split(" ");
                int w = Integer.parseInt(elems[0]);
                int h = Integer.parseInt(elems[1]);
                if (w == 0 && h == 0)
                    break;
                Board b = new Board(w, h);
                for (int i = 0; i < h; i++) {
                    ls = br.readLine().toCharArray();
                    for (int j = 0; j < w; j++) {
                        if (ls[j] == '@') {
                            b.board[i][j] = true;
                            b.init = new Tuple(i, j);
                        }
                        else {
                            b.board[i][j] = ls[j] == '.';
                        }
                    }
                }
                this.bs.add(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        for (Board b: bs) {
            boolean[][] graph = b.board;
            boolean[][] used = new boolean[b.h][b.w];
            Queue<Tuple> queue = new LinkedList<>();
            queue.add(b.init);
            int ans = 0;
            while (!queue.isEmpty()) {
                Tuple crr = queue.poll();
                if (used[crr.fst][crr.snd])
                    continue;
                used[crr.fst][crr.snd] = true;
                ans++;
                int x, y;
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        if (dx != 0 && dy != 0)
                            continue;
                        x = crr.snd + dx;
                        y = crr.fst + dy;
                        if (0 <= x && x < b.w && 0 <= y && y < b.h)
                            if (graph[y][x] && !used[y][x])
                                queue.add(new Tuple(y, x));
                    }
                }
            }
            System.out.println(ans);
        }
    }

    private class Board {
        int w, h;
        Tuple init;
        boolean[][] board;
        Board(int w, int h) {
            this.w = w;
            this.h = h;
            board = new boolean[h][w];
        }
    }

    private class Tuple {
        int fst, snd;
        Tuple(int f, int s) {
            fst = f;
            snd = s;
        }
    }
}