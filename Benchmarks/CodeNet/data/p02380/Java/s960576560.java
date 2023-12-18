
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        double a, b, c, C, S, L, h;
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        C = sc.nextDouble();
        
        S = 0.5 * a * b * Math.sin(Math.toRadians(C));
        c = a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C));
        c = Math.sqrt(c);
        L = a + b + c;
        h = b * Math.sin(Math.toRadians(C));
        
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
        
    }
}
