import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> votes = new HashMap<>();
        int mx = 0;

        for (int i = 0; i < n; i++) {
            String current = sc.nextLine().trim();
            votes.putIfAbsent(current, 0);
            votes.put(current, votes.get(current) + 1);
            mx = Math.max(mx, votes.get(current));
        }

        final int _mx = mx;
        votes.entrySet().stream()
                .filter(e -> e.getValue().equals(_mx))
                .map(Map.Entry::getKey)
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}