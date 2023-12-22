import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = cin.next();
        }

        int M = cin.nextInt();
        String[] t = new String[M];
        for (int i = 0; i < M; i++) {
            t[i] = cin.next();
        }

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int x = map.getOrDefault(s[i], 0);
            map.put(s[i], x + 1);
        }

        for (int i = 0; i < M; i++) {
            int x = map.getOrDefault(t[i], 0);
            map.put(t[i], x - 1);
        }

        int max = 0;
        for (int v : map.values()) {
            max = Math.max(v, max);
        }

        System.out.println(max);
    }
}