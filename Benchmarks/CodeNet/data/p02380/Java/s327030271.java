import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        double a = scan.nextDouble(); // ??????
        double b = scan.nextDouble(); // ???
        double C = scan.nextDouble(); // ab???????§?
        double S = a * (b * Math.sin(Math.toRadians(C))) / 2;
        double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
        double h = (S / a) * 2;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}