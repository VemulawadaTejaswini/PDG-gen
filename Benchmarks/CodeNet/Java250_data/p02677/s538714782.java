
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    static void run() {
        int A = in.nextInt(), B = in.nextInt(), H = in.nextInt(), M = in.nextInt();
        double m = 2.0 * Math.PI * M / 60;
        double h = 2.0 * Math.PI * (H * 60 + M) / (60 * 12);
        double a = Math.max(m, h) - Math.min(m, h);
        if (a >= Math.PI) a = 2 * Math.PI - a;
        double d = Math.sqrt(A*A + B*B - 2*A*B*Math.cos(a));
        System.out.println(d);
    }

    public static void main(String[] args) {
        run();
    }
}
