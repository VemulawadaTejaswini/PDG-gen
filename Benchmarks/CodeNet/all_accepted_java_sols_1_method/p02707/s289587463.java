import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < n; i++) {
            int number = scanner.nextInt();
            if (!map.containsKey(number)) {
                map.put(number, 0);
            }
            map.put(number, map.get(number) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                System.out.println(map.get(i));
            } else {
                System.out.println(0);
            }
        }
    }

}