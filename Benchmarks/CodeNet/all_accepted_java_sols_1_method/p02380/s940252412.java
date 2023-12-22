import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            double a = scn.nextDouble();
            double b = scn.nextDouble();
            double C = scn.nextDouble();
            double c = C * Math.PI / 180;
            double S = a * b * Math.sin(c) / 2;
            double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c));
            double h = b * Math.sin(c);
            System.out.println(S + " " + L + " " + h);
        }
    }
}