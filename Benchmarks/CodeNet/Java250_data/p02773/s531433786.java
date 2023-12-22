
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        for (int i = 0 ; i < N ; i++) {
            String S = scanner.next();
            if (map.containsKey(S)) {
                map.put(S, map.get(S) + 1);

            } else {
                map.put(S, 1);
            }
            max = Math.max(max, map.get(S));
        }

        List<String> stringList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                stringList.add(entry.getKey());
            }
        }
        Collections.sort(stringList);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
