package atcoder170p05;

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
            return "(" + x + "," + y + ") count=" + res[x][y];
        }
    }

    public static Queue<StackElement> stack = new PriorityQueue<StackElement>(
            new Comparator<StackElement>() {
                @Override
                public int compare(StackElement o1, StackElement o2) {
                    return Double.compare(res[o2.x][o2.y], res[o1.x][o1.y]);
                }
            });

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
        res[x1][y1] = 0.0;
        stack.add(new StackElement(x1, y1, 0, 0));
        while (!stack.isEmpty()) {
            StackElement e = stack.poll();
            // System.out.println(e);
            search(e.x, e.y, e.mukiX, e.mukiY);
            if (res[x2][y2] != null) {
                break;
            }
        }
        if (res[x2][y2] != null) {
            System.out.println((long) Math.ceil(res[x2][y2]));
            // System.out.println(stack);
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

    public static boolean isSeachable(int x, int y, double nextCount) {
        if ((!isHasu(x, y) && res[x][y] == null && res[x][y] < nextCount)) {
            return true;
        } else {
            return false;
        }
    }

    public static void search(int x, int y, int mukiX, int mukiY) {

        if (x2 != x || y2 != y) {
            double nextCount = res[x][y] + 1.0 / k;

            if (isSeachable(x + mukiX, y + mukiY, nextCount)) {
                res[x + mukiX][y + mukiY] = nextCount;
                stack.add(new StackElement(x + mukiX, y + mukiY, mukiX, mukiY));
            }

            nextCount = Math.ceil(res[x][y]) + 1.0 / k;
            if (mukiX == 0 && isSeachable(x + 1, y, nextCount)) {
                res[x + 1][y] = nextCount;
                stack.add(new StackElement(x + 1, y, 1, 0));
            }
            if (mukiX == 0 && isSeachable(x - 1, y, nextCount)) {
                res[x - 1][y] = nextCount;
                stack.add(new StackElement(x - 1, y, -1, 0));
            }
            if (mukiY == 0 && isSeachable(x, y + 1, nextCount)) {
                res[x][y + 1] = nextCount;
                stack.add(new StackElement(x, y + 1, 0, 1));
            }
            if (mukiY == 0 && isSeachable(x, y - 1, nextCount)) {
                res[x][y - 1] = nextCount;
                stack.add(new StackElement(x, y - 1, 0, -1));
            }
        }

    }
}
