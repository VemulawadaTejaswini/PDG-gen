import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> chars = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (!chars.containsKey(s)) {
                chars.put(s, 0);
            }
            int num = chars.get(s);
            chars.put(s, ++num);
        }

        int max = 0;
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : chars.entrySet()) {
            int v = entry.getValue();
            String k = entry.getKey();
            if (v > max) {
                max = v;
                result.clear();
                result.add(k);
            } else if (v == max) {
                result.add(k);
            }
        }

        result.sort(String::compareTo);
        for (String s : result) {
            System.out.println(s);
        }


    }
}