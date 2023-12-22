import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = std.next();
        }

        Map<String, Long> grouping = IntStream.range(0, n)
                .mapToObj(it -> {
                        String text = s[it];
                    return Arrays.stream(text.split(""))
                            .sorted()
                            .collect(Collectors.joining());
                    }
                )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Iterator<Map.Entry<String, Long>> it = grouping.entrySet().iterator();
        long ans = 0;
        while (it.hasNext()) {
            Map.Entry<String, Long> entry = it.next();
            long count = entry.getValue();
            if (count > 1) {
                ans += count * (count - 1) / 2;
            }
        }

        System.out.println(ans);
    }
}
