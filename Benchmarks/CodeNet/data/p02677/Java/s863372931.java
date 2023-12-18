import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double thetaM = Math.toRadians(6 * M);
        double thetaH = Math.toRadians(30 * H + 0.5 * M);
        double thetaDiff = thetaM - thetaH;

        double ans = Math.sqrt(Math.pow((double)A, 2) + Math.pow((double)B, 2) - 2*A*B*Math.cos(thetaDiff));
        System.out.println(ans);

    }
}