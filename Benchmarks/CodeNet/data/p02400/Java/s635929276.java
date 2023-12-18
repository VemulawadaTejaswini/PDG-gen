import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%f %f", area, perimeter);
        scanner.close();
    }
}

