import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            final int A = s.nextInt(),
                      B = s.nextInt(),
                      H = s.nextInt(),
                      M = s.nextInt();
            double hAngle = 2 * Math.PI * (H * 60 + M) / (60 * 12);
            double mAngle = 2 * Math.PI * M / 60;
            double theta = Math.abs(hAngle - mAngle);
            System.out.println(Math.sqrt(A*A + B*B - 2*A*B*Math.cos(theta)));
        }
    }
}
