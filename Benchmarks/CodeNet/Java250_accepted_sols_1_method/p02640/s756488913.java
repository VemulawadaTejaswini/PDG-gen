import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());

            if (y % 2 == 0 && 2*x <= y && y <= 4*x) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
