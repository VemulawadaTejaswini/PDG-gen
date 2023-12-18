import java.util.Scanner;

public class Main {


    static double next(double y, double q) {
        return y - (Math.pow(y, 3) - q) / (Math.pow(y, 2) * 3);
    }

    static double error(double y, double q) {
        return Math.abs(Math.pow(y, 3) - q) * q;
    }

    public static void main(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int q = sc.nextInt();
            if (q < 0) break;
            double x = (double) q / 2;
            while (error(x, q) >= 0.00001) {
                x = next(x, q);
            }
            System.out.println(x);
        }
    }
}