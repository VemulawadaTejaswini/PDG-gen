import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if (a <= k) {
            k -= a;
            a = 0;
            b = Math.max(0, b - k);
        } else {
            a -= k;
        }
        System.out.println(a + " " + b);
    }

}
