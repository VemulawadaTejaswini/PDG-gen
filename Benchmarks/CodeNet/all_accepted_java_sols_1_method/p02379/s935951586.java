
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double c = x - a;
        double z = y - b;
        double d = (c * c) + (z * z);
        double p = Math.sqrt(d);
        System.out.printf("%.4f\n", p);

    }
}

