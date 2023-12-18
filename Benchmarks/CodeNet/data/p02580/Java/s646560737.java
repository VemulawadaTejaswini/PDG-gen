import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;

public class Main {
    private static class Point {
        final int h;
        final int w;

        private Point(int inh, int inw) {
            h = inh;
            w = inw;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Point) {
                Point obj2 = (Point) obj;
                return this.h == obj2.h && this.w == obj2.w;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var h = sc.nextInt();
        var w = sc.nextInt();
        var m = sc.nextInt();
        var sumH = new int[h];
        var sumW = new int[w];
        var hw = new TreeSet<Point>((o1, o2) -> {
            if (o1.h != o2.h) {
                return o1.h - o2.h;
            } else {
                return o1.w - o2.w;
            }
        });
        for (int i = 0; i < m; i++) {
            hw.add(new Point((sc.nextInt() - 1), (sc.nextInt() - 1)));
        }
        for (Point e : hw) {
            sumH[e.h]++;
            sumW[e.w]++;
        }
        var mxH = 0;
        var mxW = 0;
        for (Point e : hw) {
            mxH = Math.max(mxH, sumH[e.h]);
            mxW = Math.max(mxW, sumW[e.w]);
        }
        Deque<Integer> mxHind = new ArrayDeque<>();
        Deque<Integer> mxWind = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            if (sumH[i] == mxH) {
                mxHind.add(i);
            }
        }
        for (int i = 0; i < w; i++) {
            if (sumW[i] == mxW) {
                mxWind.add(i);
            }
        }

        boolean notDualflg = false;
        for (int i : mxHind) {
            for (int j : mxWind) {
                if (!hw.contains(new Point(i, j))) {
                    notDualflg = true;
                    break;
                }
            }
            if (notDualflg) {
                break;
            }
        }

        System.out.println(mxH + mxW - ((notDualflg) ? 0 : 1));
    }
}
