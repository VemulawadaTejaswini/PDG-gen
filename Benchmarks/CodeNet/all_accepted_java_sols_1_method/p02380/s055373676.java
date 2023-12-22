import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

        double c = Math.sqrt(Math.pow((double)a, 2) + Math.pow((double)b, 2) - (2.0 * a * b * Math.cos(C * Math.PI / 180)));

        double s = (a + b + c) / 2.0;
        double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(S);
        System.out.println(a + b + c);
        System.out.println(2 * S / a);
    }
}