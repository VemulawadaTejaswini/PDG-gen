import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans=0;
        for (int i = 0; i < n; i++) {
            double tmp = sc.nextDouble();
            ans += (1 / tmp);
        }
        System.out.println(1 / ans);
    }
}