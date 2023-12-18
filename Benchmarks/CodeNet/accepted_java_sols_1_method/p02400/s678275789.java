import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double pi = Math.PI;
        double area = a * a * pi;
        double length = 2 * a * pi;
        System.out.printf("%f %f", area, length);
        sc.close();
    }
}
