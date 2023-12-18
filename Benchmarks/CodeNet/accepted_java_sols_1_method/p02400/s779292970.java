import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double r;
        r = stdIn.nextDouble();

        double a, b;
        a = r * r * Math.PI;
        b = r * 2 * Math.PI;

        System.out.printf("%.6f %.6f\n", a, b);

    }
}


