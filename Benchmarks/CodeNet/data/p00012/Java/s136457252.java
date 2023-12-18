import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res = 0;
    public static int[] ary;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            Point a = new Point(sc.nextFloat(), sc.nextFloat());
            Point b = new Point(sc.nextFloat(), sc.nextFloat());
            Point c = new Point(sc.nextFloat(), sc.nextFloat());
            Point t = new Point(sc.nextFloat(), sc.nextFloat());
            
            float ab = a.sloap(b);
            float ac = a.sloap(c);
            float at = a.sloap(t);
            float ba = b.sloap(a);
            float bc = b.sloap(c);
            float bt = b.sloap(t);
            float ca = c.sloap(a);
            float cb = c.sloap(b);
            float ct = c.sloap(t);
            
            String s = "NO";
            if (ab < at && at < ac && ba < bt && bt < bc) {
                s = "YES";
            } else if (ab < at && at < ac && bc < bt && bt < ba) {
                s = "YES";
            } else if (ab < at && at < ac && ca < ct && ct < cb) {
                s = "YES";
            } else if (ab < at && at < ac && cb < ct && ct < ca) {
                s = "YES";
            } else if (ac < at && at < ab && ba < bt && bt < bc) {
                s = "YES";
            } else if (ac < at && at < ab && bc < bt && bt < ba) {
                s = "YES";
            } else if (ac < at && at < ab && ca < ct && ct < cb) {
                s = "YES";
            } else if (ac < at && at < ab && cb < ct && ct < ca) {
                s = "YES";
            }
            System.out.println(s);
        }
    }
}


class Point {
    float x;
    float y;
    public Point(float x, float y) {
        this.x = x;this.y = y;
    }
    
    public float sloap(Point p) {
        return (y - p.y)/(x - p.x);
    }
}