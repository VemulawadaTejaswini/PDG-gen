import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = Math.PI;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = r * r * x;
        double length = 2 * r * x;

        System.out.printf("%f %f", area, length);
        System.out.printf("\n");
    }
}
