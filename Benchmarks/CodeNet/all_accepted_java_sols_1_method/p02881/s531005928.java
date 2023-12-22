import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long rt = (long) Math.sqrt(n);
        while (n % rt != 0) {
            rt--;
        }
        long result = rt + n / rt - 2;

        System.out.println(result);
    }
}
