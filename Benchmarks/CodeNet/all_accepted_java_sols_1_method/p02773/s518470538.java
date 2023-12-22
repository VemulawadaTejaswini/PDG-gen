import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            map.put(S, map.getOrDefault(S, 0)+1);
        }
        int max = 0;
        for (int c : map.values()) {
            max = Math.max(max, c);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String s = e.getKey();
            int c = e.getValue();
            if (c == max) {
                list.add(s);
            }
        }

        Collections.sort(list);
        StringBuilder ans = new StringBuilder();
        for (String l : list) {
            ans.append(l).append('\n');
        }

        System.out.print(ans);
    }
}

