import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        if (k == 0) {
            System.out.print(n);
            return;
        }

        if (n < k)
        {
            long ans = Math.min(n, Math.abs(n - k));
            System.out.print(ans);
            return;
        }

        long count = n / k;//n > k
        long biggerK = k * (count + 1);
        long smallerK = k * (count);
        long ans = Math.min(Math.min(n, Math.abs(n - biggerK)), Math.abs(n - smallerK));
        System.out.print(ans);
    }
}