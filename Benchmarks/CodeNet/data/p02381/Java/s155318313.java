import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double C = scan.nextDouble();
        double c = Math.sqrt((a *a) + (b * b) - (2 * a * b * Math.cos(C * Math.PI / 180)));
        double l = a + b + c;
        double s = l/2;
        double area = Math.sqrt(s* (s-a) *(s-b) *(s-c));
        double h = area * (2 / a);
        System.out.printf("%.8f\n", area);
        System.out.printf("%.8f\n", l);
        System.out.printf("%.8f\n", h);

    }
}
