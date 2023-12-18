import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        System.out.printf("%f %f\n", Math.PI * r * r, 2 * Math.PI * r);
    }
}

