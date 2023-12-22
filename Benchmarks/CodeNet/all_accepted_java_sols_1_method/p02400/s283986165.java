import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = Math.PI;
        double m = r * r * pi;
        double s = 2 * r * pi;
        System.out.printf("%.6f %.6f%n",m,s);
    }
}
