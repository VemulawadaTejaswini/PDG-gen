import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int n = 0; n < N; n += 1) {
            int K = sc.nextInt();
            for (int k = 0; k < K; k += 1) {
                int a = sc.nextInt();
                if (!map.containsKey(a)) {
                    map.put(a, 1);
                } else {
                    map.put(a, map.get(a) + 1);
                }
            }
        }

        Set<Integer> keys = map.keySet();
        int n = 0;
        for (int a : keys) {
            if (map.get(a) == N) {
                n += 1;
            }
        }
        System.out.println(n);
    }
}
