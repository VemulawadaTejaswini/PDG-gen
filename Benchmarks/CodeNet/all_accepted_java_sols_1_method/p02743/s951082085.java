import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double a2 = Math.sqrt(a);
        double b2 = Math.sqrt(b);
        double c2 = Math.sqrt(c);
        double d2 = c2 - (a2 + b2);
        
        // a+b+2r(ab) < c
        // 2r(ab) < c - a - b;
        // 4ab < (c - a - b) ^2
        double x3 = a2 * b2 * 2;
        
        if (c - a - b < 0) {
            System.out.println("No");
            return;
        }
        
        if ((long)4 * a * b < (long)(c-a-b) * (c-a-b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
