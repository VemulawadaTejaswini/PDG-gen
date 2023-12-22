import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (!map.containsKey(line)) {
                map.put(line, 1);
            } else {
                map.replace(line, map.get(line) + 1);
            }
        }

        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String line = sc.nextLine();
            if (!map.containsKey(line)) {
                map.put(line, 1);
            } else {
                map.replace(line, map.get(line) - 1);
            }
        }

        int max = map.values().stream().mapToInt(x -> x).filter(value -> value >= 0).max().orElse(0);
        System.out.println(max);
    }
}