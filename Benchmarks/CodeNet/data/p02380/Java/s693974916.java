import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int deg = sc.nextInt();

        double rad = Math.toRadians(deg);

        double S = a * b * Math.sin(rad) / 2.0;
        double L = a + b + Math.sqrt(Math.pow(a * 1.0, 2.0) + Math.pow(b * 1.0, 2.0));
        double h = 2.0 * S / (double)a;

        System.out.printf("%f\n%f\n%f\n", S, L, h);

        sc.close();
    }
}

