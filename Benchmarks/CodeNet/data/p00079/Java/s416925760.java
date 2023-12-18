import java.awt.geom.Point2D;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        int c=0;
        Point2D.Double[] v = new Point2D.Double[20];
        sc.useDelimiter(",| ?\n");
        while(sc.hasNext()){
                v[c] = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
                c++;
        }
        int n=c;
            double sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += ep(v[i], v[i + 1]);
            }
            sum += ep(v[n - 1], v[0]);
            double ans = Math.abs(1.0 * sum / 2.0);
            System.out.printf("%.6f\n",ans);
        }
 
    public static double ep(Point2D.Double a, Point2D.Double b) {
        return a.x * b.y - a.y * b.x;
    }
}