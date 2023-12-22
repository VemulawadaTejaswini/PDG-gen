import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double C = sc.nextInt() / 180.0 * Math.PI;
        double h = b * Math.sin(C);
        double S = a * h / 2.0;
        double r = b * Math.cos(C);
        double q = a - r;
        double p = Math.sqrt(h * h + q * q);
        double L = a + b + p;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}

