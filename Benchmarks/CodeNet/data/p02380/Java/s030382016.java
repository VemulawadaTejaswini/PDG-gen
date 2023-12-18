import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        double a = scan.nextDouble(); // ??????
        double b = scan.nextDouble(); // ???
        double C = scan.nextDouble(); // ab???????§?
        double S = (a * b) / 2;
        double L = a * b;
        double h = (S / a) * 2;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}