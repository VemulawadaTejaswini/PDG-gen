
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int C = sc.nextInt();

        double S = Math.sin(Math.toRadians(C)) * a * b / 2;
        double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
        double h = b * Math.sin(Math.toRadians(C));

        System.out.println(S);
        System.out.println(L);
        System.out.println(h);


    }
}

