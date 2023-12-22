import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long num = a + b;
        if (num >= k) {
            System.out.println(Math.min(a, k));
        } else {
            long num2 = k - num >= c ? c : k - num;
            System.out.println(a - num2);
        }
    }
}