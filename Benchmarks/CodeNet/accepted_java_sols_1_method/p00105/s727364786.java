import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Map<String, List<Integer>> map = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String str = scanner.next();
                int i = scanner.nextInt();

                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList<>());
                }
                map.get(str).add(i);
            }
            map.keySet().stream().sorted().forEach(it -> {
                System.out.println(it);
                String s = map.get(it).stream().sorted().map(String::valueOf).collect(Collectors.joining(" "));
                System.out.println(s);
            });
        }
    }
}