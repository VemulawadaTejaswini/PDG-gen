import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = Math.PI;
        double C = 2*pi*r;
        double S = pi*r*r;
        System.out.printf("%.6f %.6f\n", S, C);
        
        sc.close();
    }
}

