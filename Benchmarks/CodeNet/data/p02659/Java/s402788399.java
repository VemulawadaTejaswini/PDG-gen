import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B1 = sc.nextDouble();
        long ans = 1;
        double B2 = B1 * 100;
        
        ans = (A * (long)B2)/100;
        
        System.out.println(ans);
    }
}
