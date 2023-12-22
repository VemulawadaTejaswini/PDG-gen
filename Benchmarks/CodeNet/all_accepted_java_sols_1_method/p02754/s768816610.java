import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        if (a == 0) {
            System.out.println(0);
            return;
        } else if (b == 0) {
            System.out.println(n);
            return;
        }
        long ans = n / (a + b);
        long mod = n % (a + b);
        ans *= a;
        ans += mod <= a ? mod : a;
        System.out.println(ans);
    }
}