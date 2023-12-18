import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long a = Long.parseLong(values[0]);
        HashMap<String,Long> item = new HashMap<>();
        long max = 0;
        for (int i = 0; i < a; i++) {
            String b = scanner.nextLine().split(" ")[0];
            if (item.containsKey(b)) {
                long v = item.get(b) + 1L;
                item.replace(b,v);
                if (max <= v) {
                    max = v;
                }
            } else {
                if (max == 0) max = 1L;
                item.put(b,1L);
            }
        }
        item = item.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1, LinkedHashMap::new));
        TreeSet<String> list = new TreeSet<>();
        for (Map.Entry<String, Long> entry : item.entrySet()) {
            if (entry.getValue() >= max) {
                list.add(entry.getKey());
            } else {
                break;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}