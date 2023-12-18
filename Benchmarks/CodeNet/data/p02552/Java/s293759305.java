import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mod = 1000000007;
        long ans = (long)Math.pow(10, n) - (long)Math.pow(9, n) - (long)Math.pow(9, n) + (long)Math.pow(8, n);
        System.out.println(ans%mod);
        sc.close();
    }
}