import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; ++i) {
            String S = sc.next();
            map.put(S, map.getOrDefault(S, 0));
            map.put(S, map.get(S) + 1);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; ++i) {
            String S = sc.next();
            map.put(S, map.getOrDefault(S, 0));
            map.put(S, map.get(S) - 1);
        }
        sc.close();

        int ans = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            ans = Math.max(ans, e.getValue());
        }
        System.out.println(ans);
    }
}