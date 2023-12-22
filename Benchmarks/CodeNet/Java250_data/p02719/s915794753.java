import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long x = 0;
        x = Math.min(n % k, k - n % k);

        System.out.print(x);
    }
}
