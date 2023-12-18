import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();

        double area          = Math.pow(r, 2) * Math.PI;
        double circumference = 2 * r * Math.PI;
        System.out.printf("%.6f %.6f\n", area, circumference);
    }
}