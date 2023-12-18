import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, x3, y3, xp, yp;
        double abx, aby, bcx, bcy, cax, cay;
        double apx, apy, bpx, bpy, cpx, cpy;

        while (sc.hasNextDouble()) {
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            xp = sc.nextDouble();
            yp = sc.nextDouble();

            abx = x2 - x1;
            aby = y2 - y1;
            bcx = x3 - x2;
            bcy = y3 - y2;
            cax = x1 - x3;
            cay = y1 - y3;

            apx = xp - x1;
            apy = yp - y1;
            bpx = xp - x2;
            bpy = yp - y2;
            cpx = xp - x3;
            cpy = yp - y3;

            if (crossProduct(abx, aby, apx, apy) * crossProduct(abx, aby, -cax, -cay) > 0 &&
            crossProduct(bcx, bcy, bpx, bpy) * crossProduct(bcx, bcy, -abx, -aby) > 0 &&
            crossProduct(cax, cay, cpx, cpy) * crossProduct(cax, cay, -bcx, -bcy) > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static double crossProduct(double ux, double uy, double vx, double vy) {
        return ux * vy - uy * vx;
    }
}