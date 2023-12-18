import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Point a = new Point(sc.nextFloat(), sc.nextFloat());
            Point b = new Point(sc.nextFloat(), sc.nextFloat());
            Point c = new Point(sc.nextFloat(), sc.nextFloat());
            Point d = new Point(sc.nextFloat(), sc.nextFloat());
            
            String s = "NO";
            if (a.sloap(b) == c.sloap(d)) {
                s = "YES";
            } else if (a.sloap(b) == d.sloap(c)) {
                s = "YES";
            } else if (a.sloap(c) == b.sloap(d)) {
                s = "YES";
            } else if (a.sloap(c) == d.sloap(b)) {
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
        this.x = x;
        this.y = y;
    }
    
    public float sloap(Point p) {
        return (p.x - x)/(p.y - y);
    }
}