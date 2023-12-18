import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            Path2D.Double s = new Path2D.Double();
            String[] S = sc.nextLine().split(" ");
            double[] z = new double[8];

            for (int i = 0; i < 8; i++) {
                z[i] = Double.parseDouble(S[i]);
            }

            s.moveTo(z[0], z[1]);
            s.lineTo(z[2], z[3]);
            s.lineTo(z[4], z[5]);

            Point2D.Double p = new Point2D.Double(z[6], z[7]);
            System.out.println((s.contains(p))? "YES" : "NO");
        }
    }
}