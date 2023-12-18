import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (in.hasNextLine()) {
            double xa = nd(in), ya = nd(in), xb = nd(in), yb = nd(in), //
                    xc = nd(in), yc = nd(in), xd = nd(in), yd = nd(in);
            double vabx = xb - xa, vaby = yb - ya;
            double vcdx = xd - xc, vcdy = yd - yc;
            double naiseki = vabx * vcdx + vaby * vcdy + 0.0;
            String ans = Math.abs(naiseki) < 1e-10 ? "YES" : "NO";

            System.out.println(ans);
        }
    }

    private static double nd(Scanner in) {
        return in.nextDouble();
    }
}