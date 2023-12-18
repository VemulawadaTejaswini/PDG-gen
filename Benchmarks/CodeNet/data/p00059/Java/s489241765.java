import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double xa1 = sc.nextDouble();
            double ya1 = sc.nextDouble();
            double xa2 = sc.nextDouble();
            double ya2 = sc.nextDouble();
            double xb1 = sc.nextDouble();
            double yb1 = sc.nextDouble();
            double xb2 = sc.nextDouble();
            double yb2 = sc.nextDouble();
            Rectangle2D.Double A = new Rectangle2D.Double(xa1, ya2, xa2 - xa1,
                    ya2 - ya1);
            Rectangle2D.Double B = new Rectangle2D.Double(xb1, yb2, xb2 - xb1,
                    yb2 - yb1);
            String ans = A.intersects(B) ? "YES" : "NO";
            System.out.println(ans);
        }
    }
}