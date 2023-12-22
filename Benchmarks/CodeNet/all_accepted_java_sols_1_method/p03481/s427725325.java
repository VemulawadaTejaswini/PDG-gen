import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        final long b = sc.nextLong();
        int ans = 0;
        while (a <= b) {
            a *= 2;
            ans += 1;
        }
        System.out.println(ans);
    }
}