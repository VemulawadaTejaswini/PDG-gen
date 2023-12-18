import static java.lang.Math.floor;
import static java.lang.Math.round;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a;
        double b;
        double result;

        a = scanner.nextLong();
        b = scanner.nextDouble();

        result = (double)a*b;

        System.out.print(round(floor(result)));
    }
}
