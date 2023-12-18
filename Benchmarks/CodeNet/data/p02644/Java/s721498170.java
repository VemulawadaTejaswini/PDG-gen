import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {
    public static int h;
    public static int w;
    public static int k;
    public static int x2;
    public static int y2;
    public static String[] c;
    public static Double res[][];
    public static Queue<StackElement> stack = new PriorityQueue<>(
            new Comparator<StackElement>() {

                @Override
                public int compare(StackElement o1, StackElement o2) {
                    return Double.compare(res[o1.x][o1.y], res[o2.x][o2.y]);
                }
            });

    static class StackElement {
        int x;
        int y;
        int mukiX;
        int mukiY;

        public StackElement(int xin, int yin, int mukiXin, int mukiYin) {
            x = xin;
            y = yin;
            mukiX = mukiXin;
            mukiY = mukiYin;
        }

        public String toString() {
            return "(" + x + " " + y + " " + res[x][y] + ")";
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
        res = new Double[h][];
        IntStream.range(0, h).forEach(i -> {
            res[i] = new Double[w];
        });
        stack.add(new StackElement(x1, y1, 0, 0));
        res[x1][y1] = 0.0;
        while (!stack.isEmpty()) {
            StackElement e = stack.poll();
            search(e.x, e.y, e.mukiX, e.mukiY);
        }
        if (res[x2][y2] != null) {
            System.out.println((long)Math.ceil(res[x2][y2]));
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

    public static boolean isSeachable(int prevX, int prevY, int mukiX,
            int mukiY, double count) {
        int nextX = prevX + mukiX;
        int nextY = prevY + mukiY;
        if (isHasu(nextX, nextY)
                || res[nextX][nextY] != null && count >= res[nextX][nextY]) {
            return false;
        } else if (res[nextX][nextY] == null || count < res[nextX][nextY]) {
            return true;
        } else {
            return false;
        }
    }

    public static void input(int prevX, int prevY, int mukiX, int mukiY,
            double nextCount) {
        int nextX = prevX + mukiX;
        int nextY = prevY + mukiY;
        if (isSeachable(prevX, prevY, mukiX, mukiY, nextCount)) {
            res[nextX][nextY] = nextCount;
            stack.add(new StackElement(nextX, nextY, mukiX, mukiY));
        }
    }

    public static void search(int x, int y, int mukiX, int mukiY) {

        if (x2 != x || y2 != y) {
            if (mukiX != 0 || mukiY != 0) {
                input(x, y, mukiX, mukiY, res[x][y] + 1.0 / k);
            }
            double nextCount = Math.ceil(res[x][y]) + 1.0 / k;
            if (mukiY == 0) {
                input(x, y, 0, 1, nextCount);
                input(x, y, 0, -1, nextCount);
            }
            if (mukiX == 0) {
                input(x, y, 1, 0, nextCount);
                input(x, y, -1, 0, nextCount);
            }
        }
    }
}
