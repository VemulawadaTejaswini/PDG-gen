import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = sc.nextInt();
                System.out.println((a <= x && x <= (a + b)) ? "YES" : "NO");
            }
        }
    }
}