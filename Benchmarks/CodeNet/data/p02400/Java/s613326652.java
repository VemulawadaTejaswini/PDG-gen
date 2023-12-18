import static java.lang.Math.PI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double length = 2 * Math.PI * r;
        double area = PI * r * r;
        System.out.printf ("%.6f %.6f\n",area,length); 
        scanner.close();
    }
}
