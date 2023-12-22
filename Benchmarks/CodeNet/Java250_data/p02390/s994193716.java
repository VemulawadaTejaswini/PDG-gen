import java.util.*;

class Watch {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int s = sc.nextInt();
        System.out.printf("%d:%d:%d\n", s / 3600, s / 60 % 60, s % 60);
    }
}
public class Main {
    public static void main(String... args) {
        Watch.main();
    }
}