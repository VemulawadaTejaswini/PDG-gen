import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC149B - Greedy Takahashi

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long n = k - a;

        if (a >= k) {
            a -= k;
        } else {
            a = 0;
        }

        if (n > 0) {
            b -= n;
        }

        if (b < 0) {
            b = 0;
        }

        System.out.println(a + " " + b);
    }
}