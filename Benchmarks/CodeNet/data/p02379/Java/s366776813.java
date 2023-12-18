
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double xx = Math.abs(x1 - x2);
        double yy = Math.abs(y1 - y2);
        double xxyy = Math.pow(xx, 2) + Math.pow(yy, 2);
        double result = Math.sqrt(xxyy);
        System.out.println(result);
    }
}

