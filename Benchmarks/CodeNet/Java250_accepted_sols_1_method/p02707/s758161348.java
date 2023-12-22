import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int val = scanner.nextInt() - 1;
            int count = map.getOrDefault(val, 0);
            map.put(val, ++count);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(map.getOrDefault(i, 0));
        }
    }
}