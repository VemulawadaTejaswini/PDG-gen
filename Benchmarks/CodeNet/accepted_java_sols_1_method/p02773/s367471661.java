import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.next();
            }

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                Integer count = map.get(S[i]);
                if (count == null) {
                    count = 1;
                } else {
                    count = count + 1;
                }

                map.put(S[i], count);
            }

            int max = 0;
            for (Integer count : map.values()) {
                max = Math.max(max, count);
            }

            List<String> list = new ArrayList<>();
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    list.add(entry.getKey());
                }
            }

            Collections.sort(list);

            StringBuilder ans = new StringBuilder();
            for (String s : list) {
                ans.append(s).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}
