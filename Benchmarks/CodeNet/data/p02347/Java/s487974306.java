import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(0);
        int n = in.nextInt();
        System.out.println(n);
        Point[] pts = new Point[n];
        for (int i = 0; i < n; i++) {
            pts[i] = new Point(i, in.nextInt(), in.nextInt());
        }
        //// try kd tree
        KdTree kdTree = new KdTree(pts);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            Rect rect = new Rect(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
            ArrayList<Point> inPts = new ArrayList<>();

            kdTree.queryRect(rect, inPts);

            Point[] tmp = new Point[inPts.size()];
            tmp = inPts.toArray(tmp);
            Arrays.sort(tmp, Point.comparatorI);
            for (Point p : tmp) {
                p.print();
            }
            System.out.println();
        }

        System.out.println(n);;
//// 2d search is no way~
//        Arrays.sort(pts, Point.comparatorX);
//        for (int i = 0; i < q; i++) {
//            int sx = rects[i].sx;
//            int sy = rects[i].sy;
//            int tx = rects[i].tx;
//            int ty = rects[i].ty;
//
//            int il = MySearch.lower_bound(pts, new Point(-1, sx, 0), Point.comparatorX);
//            int ir = MySearch.upper_bound(pts, new Point(-1, tx, 0), Point.comparatorX) ;
//            Point[] inRangePts = Arrays.copyOfRange(pts, il, ir);
//
//            Arrays.sort(inRangePts, Point.comparatorY);
//
//            il = MySearch.lower_bound(inRangePts, new Point(-1, 0, sy), Point.comparatorY);
//            ir = MySearch.upper_bound(inRangePts, new Point(-1, 0, ty), Point.comparatorY);
//
//            Arrays.sort(inRangePts, il, ir, Point.comparatorI);
//            for (int j = il; j < ir; j++) {
//                inRangePts[j].print();
//            }
//            System.out.println();
//        }

    }
}
class KdTree{


    static class Node{
        Node ld , ru; // left down vs right up
        Point p;

        Node(Point p) {
            this.p = p;
        }
    }
    Node root;

    KdTree(Point[] pts) {
        Arrays.sort(pts, Point.comparatorX);
        int l = 0, r = pts.length, m = (l+r)/2;
        Point pMid = pts[m];

        root = new Node(pMid);

        int depth = 1;
        build(root, pts, 0, m, m + 1, r, depth);

    }

    private void build(Node parent, Point[] pts, int ll, int lr, int rl, int rr, int depth) {
        Comparator<Point> c = depth % 2 == 0 ? Point.comparatorX : Point.comparatorY;

        // left or down
        if (ll < lr) {
            Arrays.sort(pts, ll, lr, c);
            int lm = (ll + lr) / 2;
            Node ld = new Node(pts[lm]);
            parent.ld = ld;
            build(ld, pts, ll, lm, lm + 1, lr, depth + 1);
        }

        // right or up
        if (rl < rr) {
            Arrays.sort(pts, rl, rr, c);
            int rm = (rl + rr) / 2;
            Node ru = new Node(pts[rm]);
            parent.ru = ru;
            build(ru, pts, rl, rm, rm + 1, rr, depth + 1);
        }
    }

    public void queryRect(Rect rect, ArrayList<Point> inPts) {
        queryRectRecur(rect, root, 0, inPts);

    }

    private void queryRectRecur(Rect rect, Node node, int depth, ArrayList<Point> inPts) {
        if (node == null) {
            return;
        }

        if(rect.cover(node.p)) inPts.add(node.p);

        if (depth % 2 == 0) {
            if(rect.tx >= node.p.x) queryRectRecur(rect, node.ru, depth+1, inPts);
            if(rect.sx <= node.p.x) queryRectRecur(rect, node.ld, depth+1, inPts);
        }
        else{
            if(rect.ty >= node.p.y) queryRectRecur(rect, node.ru, depth+1, inPts);
            if(rect.sy <= node.p.y) queryRectRecur(rect, node.ld, depth+1, inPts);
        }
    }
}


class Point{
    final int i, x, y;
    static Comparator<Point> comparatorX = (t0, t1) -> {
        if(t0.x > t1.x) return 1;
        if(t0.x < t1.x) return -1;
        return 0;
    };
    static Comparator<Point> comparatorY = (t0, t1) -> {
        if(t0.y > t1.y) return 1;
        if(t0.y < t1.y) return -1;
        return 0;
    };
    static Comparator<Point> comparatorI = (t0, t1) -> {
        if(t0.i > t1.i) return 1;
        if(t0.i < t1.i) return -1;
        return 0;
    };

    Point(int i, int x, int y) {
        this.i = i;
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(i);
    }

}

class Rect{
    final int sx, sy, tx, ty;

    Rect(int sx, int tx, int sy, int ty) {
        this.sx = sx;
        this.tx = tx;
        this.sy = sy;
        this.ty = ty;
    }

    public boolean cover(Point p) {
        return (sx <= p.x && tx >= p.x && sy <= p.y && ty >= p.y);
    }
}

class MySearch{
    static<T> int lower_bound(T[] a, T key, Comparator<T> c) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if(c.compare(key, a[m]) <= 0) r = m;
            else l = m + 1;
        }
        return l;
    }

    static<T> int upper_bound(T[] a, T key, Comparator<T> c) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if(c.compare(key, a[m]) >= 0) l = m + 1;
            else r = m;
        }
        return l;
    }
}
