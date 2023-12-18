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

        double xx = Math.pow(x2 - x1, 2);
        double yy = Math.pow(y2 - y1, 2);
        double sum = Math.sqrt(yy + xx);
        System.out.println(String.format("%.6f", sum));
    }
}