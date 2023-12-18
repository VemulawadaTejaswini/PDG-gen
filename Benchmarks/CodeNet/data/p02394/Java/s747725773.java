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

        Point(Point p) {
            this(p.x, p.y);
        }

        public boolean greaterThanOrEqual(Point other) {
            return this.x >= other.x && this.y >= other.y;
        }

        public boolean lessThanOrEqual(Point other) {
            return this.x <= other.x && this.y <= other.y;
        }

        public boolean isInside(Rectangle r) {
            return greaterThanOrEqual(r.getLeftBottom()) &&
                lessThanOrEqual(r.getRightTop());
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
            return north().isInside(r) &&
                south().isInside(r) &&
                west().isInside(r) &&
                east().isInside(r);
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

        public Point getLeftBottom() {
            return new Point(leftBottom);
        }
      
        public Point getRightTop() {
            return new Point(rightTop);
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