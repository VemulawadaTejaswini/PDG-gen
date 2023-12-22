import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        int result = 100000 * 5000 * 2;
        for (int i = 0; i <= 100000; i++) {
            result = Math.min(result, i * 2 * C + Math.max(0, X - i) * A + Math.max(0, Y - i) * B);

        }
        System.out.println(result);
    }
}