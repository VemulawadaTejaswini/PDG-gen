import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.toRadians(sc.nextDouble());
        System.out.println(0.5 * a * b * Math.sin(c));
        System.out.println(a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c)));
        System.out.println(b * Math.sin(c));
    }
}