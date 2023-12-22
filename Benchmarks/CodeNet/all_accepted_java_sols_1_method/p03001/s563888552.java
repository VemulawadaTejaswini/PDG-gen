import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        double w = scanner.nextInt();
        double h = scanner.nextInt();
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        System.out.println(w * h / 2 + " " + (x * 2 == w && y * 2 == h ? 1 : 0));
    }
}