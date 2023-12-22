import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (map.containsKey(s)) {
                int count = map.get(s) + 1;
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = map.entrySet().stream()
                .sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()))
                .collect(Collectors.toList());

        int max = 0;
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            int count = entry.getValue();
            if (max <= count) {
                max = count;
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}