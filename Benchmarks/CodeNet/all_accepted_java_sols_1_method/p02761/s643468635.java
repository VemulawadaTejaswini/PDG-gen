import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        boolean ok = true;
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            int v = map.getOrDefault(s, -1);
            if (v == -1 || v == c) {
                map.put(s, c);
            } else {
                ok = false;
            }
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }

        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = map.getOrDefault(i+1, -1);
        }
        if (N == 1) {
            System.out.println(d[0] == -1 ? 0 : d[0]);
            return;
        }

        // N > 1
        if (d[0] == 0) {
            System.out.println(-1);
            return;
        }
        if (d[0] == -1) {
            d[0] = 1;
        }
        for (int i = 1; i < N; i++) {
            if (d[i] == -1) {
                d[i] = 0;
            }
        }
        String ans = "";
        for (int i = 0; i < N; i++) {
            ans = ans+d[i];
        }
        System.out.println(ans);
    }
}
