import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int i, j, k;
        double a, b, c, S, L, h;
         
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
         
        S = a * b * Math.sin(Math.toRadians(c)) / 2;
        L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)));
        h = 2 * S / a;
         
        System.out.printf("%f\n%f\n%f", S, L, h);
    }
}

