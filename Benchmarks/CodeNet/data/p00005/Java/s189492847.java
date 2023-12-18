import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            long g = gcd(a, b);

            System.out.println(g + " " + (a / g * b));
        }
    }

    private static long gcd(long a, long b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }

        long ans = 0;
        while (a % b != 0) {
            ans = a % b;
            a = b;
            b = ans;
        }

        return ans;
    }
}