// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long a = x%y;
        long p = Math.min(a,y-a);
        
        
        
        System.out.println(p);
    }
}
