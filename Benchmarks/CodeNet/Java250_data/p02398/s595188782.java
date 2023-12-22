import java.util.*;

class HowManyDivisors {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
public class Main {
    public static void main(String... args) {
        HowManyDivisors.main();
    }
}