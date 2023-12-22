import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (scanner.hasNext()) {
            long x0 = scanner.nextLong();
            long y0 = scanner.nextLong();
            
            long x = x0;
            long y = y0;
            long gcd = 0;
            long lcm = 0;
            
            while (x != y) {
                if (y > x) {
                    long temp = y;
                    y = x;
                    x = temp;
                }
                x = x - y; 
            }
            gcd = x;         
            lcm = x0 * y0 /gcd;
            System.out.println(gcd + " " + lcm);
        }
    }
}