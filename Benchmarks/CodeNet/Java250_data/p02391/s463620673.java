import java.util.*;

class SmallLargeOrEqual {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        System.out.println(a < b ? "a < b" : a > b ? "a > b" : "a == b");
    }
}
public class Main {
    public static void main(String... args) {
        SmallLargeOrEqual.main();
    }
}