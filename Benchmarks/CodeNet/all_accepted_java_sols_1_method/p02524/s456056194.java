import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int C = scanner.nextInt();
        
        double S = 0;
        double L = 0;
        double h = 0;

        h = b * Math.sin(Math.toRadians(C));
        S =  (a * h) / 2;
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2) - 2*a*b*Math.cos(Math.toRadians(C)));
        L = a + b + c;
        
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}