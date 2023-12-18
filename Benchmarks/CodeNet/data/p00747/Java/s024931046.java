import java.util.*;

class Walker {
    private static int w;
    private static int h;
    private static int[][] walls;
    private static LinkedList<Walker> ret = new LinkedList<>();
    private static int[] dy = {-1, 0, 1, 0};
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dwy = {0, 1, 2, 1};
    private static int[] dwx = {0, 1, 0, 0};

    int y, x, walks;

    Walker(int _w, int _h, int[][] _walls, int _y, int _x, int _walks) {
        w = _w;
        h = _h;
        walls = new int[h*2+1][w+1];
        for (int i=0; i<h*2+1; i++) System.arraycopy(_walls[i], 0, walls[i], 0, w+1);
        y = _y;
        x = _x;
        walks = _walks;
    }

    Walker(int _y, int _x, int _walks) {
        y = _y;
        x = _x;
        walks = _walks;
    }

    @Override
    public int hashCode() {
        return y*w + x;
    }

    LinkedList<Walker> next() {
        ret.clear();

        for (int i=0; i<4; i++) {
            if (walls[y*2+dwy[i]][x+dwx[i]] == 0) {
                ret.add(new Walker(y+dy[i], x+dx[i], walks+1));
            }

        }

        return ret;
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Queue<Walker> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int w, h;
        int[][] walls;

        while (true) {
            set.clear();
            queue.clear();

            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0) break;

            walls = new int[h*2+1][w+1];
            for (int i=0; i<2*h+1; i++) {
                if (i == 0 || i == 2*h) Arrays.fill(walls[i], 1);
                else if (i % 2 == 1) {
                    walls[i][0] = walls[i][w] = 1;
                    for (int j=1; j<w; j++) {
                        walls[i][j] = sc.nextInt();
                    }
                } else if (i % 2 == 0) {
                    for (int j=0; j<w; j++) {
                        walls[i][j] = sc.nextInt();
                    }
                }
            }

            Walker rootWalker = new Walker(w, h, walls, 0, 0, 1);

            set.add(rootWalker.hashCode());
            queue.add(rootWalker);

            while (!queue.isEmpty()) {
                Walker nowWalker = queue.poll();
                if (nowWalker.x == w-1 && nowWalker.y == h-1) {
                    System.out.println(nowWalker.walks);
                    break;
                }
                for (Walker nextWalker : nowWalker.next()) {
                    if (!set.contains(nextWalker.hashCode())) {
                        set.add(nextWalker.hashCode());
                        queue.add(nextWalker);
                    }
                }
            }
            if (!set.contains(h*w-1)) System.out.println(0);
        }
    }
}