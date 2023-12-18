import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());

        long max = Long.MIN_VALUE;
        max = Math.max(max, (a * c) % mod);
        max = Math.max(max, (b * c) % mod);
        max = Math.max(max, (a * d) % mod);
        max = Math.max(max, (b * d) % mod);
        System.out.println(max);
    }
}