
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final String word = in.next();
            counter.compute(word, (key, count) -> {
                if (count == null) {
                    count = 0;
                }
                count += 1;
                return count;
            });
        }

        final Comparator<Map.Entry<String, Integer>> comparing = Comparator.comparing(Map.Entry::getValue);
        List<Map.Entry<String, Integer>> result = counter.entrySet().stream()
                .sorted(Comparator.comparingInt((ToIntFunction<Map.Entry<String, Integer>>) Map.Entry::getValue)
                        .reversed()
                        .thenComparing(Map.Entry::getKey)).collect(Collectors.toList());
        final Integer count = result.get(0).getValue();
        for (int i = 0; i < result.size(); i++) {
            final Map.Entry<String, Integer> entry = result.get(i);
            if (entry.getValue().equals(count)) {
                System.out.println(entry.getKey());
            } else {
                break;
            }
        }
    }
}
