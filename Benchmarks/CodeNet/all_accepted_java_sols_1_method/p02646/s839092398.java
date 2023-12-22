import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long v = sc.nextInt();
        long b = sc.nextInt();
        long w = sc.nextInt();
        long t = sc.nextInt();
        
        long mae;
        long ato;
        if (a < b) {
            mae = a + v * t;
            ato = b + w * t;
        } else {
            mae = a - v * t;
            ato = b - w * t;
        }
        
        
        boolean ok = false;
        if (a < b) {
            if (mae >= ato) ok = true;
        } else {
            if (ato >= mae) ok = true;
        }
        if (ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
