import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        double ans1 = 1;
        long ans2 = 1;
        
        ans1 = A * B;
        ans2 = (long)ans1;
        
        System.out.println(ans2);
    }
}
