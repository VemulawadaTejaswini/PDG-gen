
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = a * b;
        double d = c / 3.305785;
        System.out.printf("%.4f\n", d);

    }
}

