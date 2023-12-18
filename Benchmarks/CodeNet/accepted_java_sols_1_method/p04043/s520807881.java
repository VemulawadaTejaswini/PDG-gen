import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Map<Integer, Integer> m = new HashMap<>();
        m.put(a, m.getOrDefault(a, 0) + 1);
        m.put(b, m.getOrDefault(b, 0) + 1);
        m.put(c, m.getOrDefault(c, 0) + 1);

        if (m.getOrDefault(5, 0) == 2 && m.getOrDefault(7, 0) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
