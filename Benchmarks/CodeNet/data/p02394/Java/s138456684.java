import java.util.*;

class CircleInARectangle {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int W = sc.nextInt();
        final int H = sc.nextInt();
        final int x = sc.nextInt();
        final int y = sc.nextInt();
        final int r = sc.nextInt();
        System.out.println(r <= x && r <= y && x <= W - r && y <= H - r ? "Yes" : "No");
    }
}
public class Main {
    public static void main(String... args) {
        CircleInARectangle.main();
    }
}