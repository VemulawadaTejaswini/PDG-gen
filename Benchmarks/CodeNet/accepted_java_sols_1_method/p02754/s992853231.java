import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = n /(a+b);
        long y = n - (a+b)*x;
        long ans = x*a + Math.min(y, a);
        System.out.println(ans);
        sc.close();

    }

}
