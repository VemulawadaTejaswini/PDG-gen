import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long sum = 0;
        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1L);
            }
        }

        long ret = 0;
        for (long value : map.values()) {
            ret += (value * (value - 1)) / 2;
        }

        System.out.println(ret);
    }
}