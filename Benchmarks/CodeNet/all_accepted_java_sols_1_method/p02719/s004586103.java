import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long k = scanner.nextLong();

        long div = n % k;
        long result = Math.abs(div - k);
        System.out.println(Math.min(result, div));
    }
}
