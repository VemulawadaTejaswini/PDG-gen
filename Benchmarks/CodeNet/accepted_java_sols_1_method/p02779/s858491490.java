import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (!map.containsKey(a)) map.put(a, 0);
            map.put(a, map.get(a) + 1);
        }

        for (int value: map.values()) {
            if (value > 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
