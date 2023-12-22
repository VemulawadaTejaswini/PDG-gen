import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        n %= k;
        if (2 * n < k) {
            System.out.println(n);
        } else {
            n = k % n;
            System.out.println(n);
        }
        sc.close();
    }
}