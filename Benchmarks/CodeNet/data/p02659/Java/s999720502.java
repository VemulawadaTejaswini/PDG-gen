import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double ans = A * B;
        ans = Math.floor(ans);
        
        System.out.println(String.format("%.0f", ans));
    }
}