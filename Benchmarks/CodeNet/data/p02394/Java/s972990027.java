import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Integer[] input = readInput();

        int W = input[0];
        int H = input[1];
        int x = input[2];
        int y = input[3];
        int r = input[4];

        Circle c = new Circle(x, y, r);
        if (c.isInside(new Rectangle(W, H))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    protected static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean greaterThanOrEqual(Point other) {
            return this.x >= other.x && this.y >= other.y;
        }

        public boolean lessThanOrEqual(Point other) {
            return this.x <= other.x && this.y <= other.y;
        }
    }

    protected static class Circle {
        private int x;
        private int y;
        private int r;

        Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public boolean isInside(Rectangle r) {
            return r.isInside(north()) &&
                r.isInside(south()) &&
                r.isInside(west()) &&
                r.isInside(east());
        }

        protected Point north() {
            return new Point(x, y + r);
        }

        protected Point south() {
            return new Point(x, y - r);
        }

        protected Point west() {
            return new Point(x - r, y);
        }

        protected Point east() {
            return new Point(x + r, y);
        }
    }

    public static class Rectangle {
        Point leftBottom;
        Point rightTop;

        Rectangle(int w, int h) {
            leftBottom = new Point(0, 0);
            rightTop = new Point(w, h);
        }

        public boolean isInside(Point p) {
            return p.greaterThanOrEqual(leftBottom) &&
                p.lessThanOrEqual(rightTop);
        }
    }

    public static Integer[] readInput() {
        List<Integer> l = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            l.add(sc.nextInt());
        }
        return l.toArray(new Integer[l.size()]);
    }
}