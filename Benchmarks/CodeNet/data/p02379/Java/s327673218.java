import java.util.Scanner;

/**
 * Distance
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double xx = Math.abs(Math.abs(x2) - Math.abs(x1));
        double yy = Math.abs(Math.abs(y2) - Math.abs(y1));
        double sum = Math.sqrt(yy + xx);
        if (xx == yy) {
            System.out.println(String.format("%.6f", sum));
        } else {
            System.out.println(String.format("%.6f", sum * sum));
        }
    }
}