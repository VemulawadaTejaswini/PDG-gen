import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int[] Ai;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ai = new int[N];
            for (int i = 1; i < N; i++) {
                Ai[i] = sc.nextInt();
            }
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i < N; i++) {
            int js = Ai[i];
            int cnt = map.getOrDefault(js,0);
            map.put(js,++cnt);
        }
        for (int i = 1; i <= N; i++) {
            int cnt = map.getOrDefault(i,0);
            System.out.println(cnt);
        }

    }
}
