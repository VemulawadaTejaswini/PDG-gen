import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        if (n % k == 0) {
            System.out.println(0);
            return;
        }
        long mod = Math.abs(n % k - k);
        System.out.println(Math.min(n % k, mod));
    }
}