import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long n = sc.nextLong();
        final long k = sc.nextLong();

        final long t = n % k;
        System.out.println(Math.min(t, k-t));
    }
}
