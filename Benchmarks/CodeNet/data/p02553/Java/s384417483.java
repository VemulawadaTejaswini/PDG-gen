import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long ans = a * c;
        ans = Math.max(ans, a * d);
        ans = Math.max(ans, b * c);
        ans = Math.max(ans, b * d);

        System.out.println(ans);
    }
}