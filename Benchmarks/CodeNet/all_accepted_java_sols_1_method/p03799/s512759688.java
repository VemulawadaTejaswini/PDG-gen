import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (2 * n >= m) {
            System.out.println(m/2);
            return;
        }

        m -= 2 * n;
        long div = m/4;
        System.out.println(n + div);
    }
}