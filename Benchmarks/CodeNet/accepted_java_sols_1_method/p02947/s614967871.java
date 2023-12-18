
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Long> counts = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            String s = scanner.next();
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            s = new String(tmp);
            long count = counts.getOrDefault(s, 0L);
            counts.put(s, count + 1L);
        }
        long pairs = 0;
        for (long count : counts.values()) {
            pairs += (count * (count - 1L) / 2);
        }
        System.out.println(pairs);
    }
}