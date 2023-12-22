import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double pi = Math.PI;

        System.out.printf("%f %f\n",r*r*pi,2*r*pi);
    }
}
