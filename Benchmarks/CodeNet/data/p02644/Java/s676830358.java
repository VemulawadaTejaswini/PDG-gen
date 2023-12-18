import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

public class Main {
    public static int h;
    public static int w;
    public static int k;
    public static int x2;
    public static int y2;
    public static String[] c;
    public static Integer res[][];
    public static Deque<StackElement> stack = new ArrayDeque<>();

    static class StackElement {
        int x;
        int y;

        public StackElement(int xin, int yin) {
            x = xin;
            y = yin;
        }

        public String toString() {
            return "(" + x + " " + y + ")";
        }
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        k = sc.nextInt();

        var x1 = sc.nextInt() - 1;
        var y1 = sc.nextInt() - 1;
        x2 = sc.nextInt() - 1;
        y2 = sc.nextInt() - 1;
        c = new String[h];
        IntStream.range(0, h).forEach(i -> {
            c[i] = sc.next();
        });
        res = new Integer[h][];
        IntStream.range(0, h).forEach(i -> {
            res[i] = new Integer[w];
        });
        stack.push(new StackElement(x1, y1));
        res[x1][y1] = 0;
        while (!stack.isEmpty()) {
            StackElement e = stack.pollLast();
            // System.out.println(e);
            search(e.x, e.y);
            if (x2 == e.x && y2 == e.y) {
                break;
            }
        }
        if (res[x2][y2] != null) {
            System.out.println(res[x2][y2]);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isHasu(int x, int y) {
        if (x < 0 || x >= h || y < 0 || y >= w) {
            return true;
        } else {
            return c[x].charAt(y) == '@';
        }
    }

    public static boolean input(int prevX, int prevY, int mukiX,
            int mukiY, int nextCount) {
        int nextX = prevX + mukiX;
        int nextY = prevY + mukiY;

        if (isHasu(nextX, nextY)) {
            // break loop
            return true;
        }
        if (res[nextX][nextY] != null && res[nextX][nextY] < nextCount) {
            return true;
        }
        if ((res[nextX][nextY] == null
                || res[nextX][nextY] > nextCount)) {
            res[nextX][nextY] = nextCount;
            stack.push(new StackElement(nextX, nextY));

        }
        return false;
    }

    public static void search(int x, int y) {

        if (x2 != x || y2 != y) {
            int nextCount = res[x][y] + 1;
            for (int i = 1; i <= k; i++) {
                if (input(x, y, i, 0, nextCount)) {
                    break;
                }
            }

            for (int i = 1; i <= k; i++) {
                if (input(x, y, -i, 0, nextCount)) {
                    break;
                }
            }

            for (int i = 1; i <= k; i++) {
                if (input(x, y, 0, i, nextCount)) {
                    break;
                }
            }

            for (int i = 1; i <= k; i++) {
                if (input(x, y, 0, -i, nextCount)) {
                    break;
                }
            }
        }
    }
}