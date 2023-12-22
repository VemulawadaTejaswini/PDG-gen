import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble();
        int C = scan.nextInt();
        double c2 = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(c2);

        double S = (a * b * Math.sin(Math.toRadians(C))) / 2;
        System.out.printf("%5.8f", S);
        System.out.println();

        double L = a + b + Math.sqrt(c2 - 2 * a * b * (Math.cos(Math.toRadians(C))));
        System.out.printf("%5.8f", L);
        System.out.println();

        double h = b * Math.sin(Math.toRadians(C));
        System.out.printf("%5.8f", h);
        System.out.println();
    }
}