
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double e = sc.nextInt();
        double f = sc.nextInt();
        double x;
        double y;
        double ae;
        double bd;
        double o;
        double af;
        double dc;
        double p;
        double bf;
        double ec;
        double q;

        ae = a * e;
        bd = b * d;
        o = bd - ae;

        af = a * f;
        dc = d * c;
        p = dc - af;

        y = p / o;

        bf = b * f;
        ec = e * c;
        q = (ec - bf);

        x = q / o;
        if (Math.abs(x) < 0.0001) {
            x = 0;
        }
        if (Math.abs(y) < 0.0001) {
            y = 0;
        }
        System.out.printf("%.3f %.3f\n", x, y);
    }
}

