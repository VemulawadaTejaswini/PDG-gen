import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    long convert(long N, int A, int B, int C, int D) {
        long i = 1;
        HashMap<Long, Long> map = new HashMap<>();
        map.put(i, (long) D);
        long bound = N + 5;
        for (i = 1; i <= bound; i++) {
            if (2 * i <= bound) {
                if (map.containsKey(2 * i)) {
                    if (map.get(i) + A < map.get(2 * i)) {
                        map.put(2 * i, Math.min(map.get(i) + A, map.get(2 * i)));
                    }
                } else {
                    map.put(2 * i, map.get(i) + A);
                }
            }

            if (3 * i <= bound) {
                if (map.containsKey(3 * i)) {
                    if (map.get(i) + B < map.get(3 * i)) {
                        map.put(3 * i, Math.min(map.get(i) + B, map.get(3 * i)));
                    }
                } else {
                    map.put(3 * i, map.get(i) + B);
                }
            }

            if (5 * i <= bound) {
                if (map.containsKey(5 * i)) {
                    if (map.get(i) + C < map.get(5 * i)) {
                        map.put(5 * i, Math.min(map.get(i) + C, map.get(5 * i)));
                    }
                } else {
                    map.put(5 * i, map.get(i) + C);
                }
            }


            if (i + 1 <= bound) {
                if (map.containsKey(i + 1)) {
                    if (map.get(i) + D < map.get(i + 1)) {
                        map.put(i + 1, Math.min(map.get(i) + D, map.get(i + 1)));
                    }
                } else {
                    map.put(i + 1, map.get(i) + D);
                }
            }

            if (i - 1 <= bound && i - 1 >= 0) {
                if (map.containsKey(i - 1)) {
                    if (map.get(i) + D < map.get(i - 1)) {
                        map.put(i - 1, Math.min(map.get(i) + D, map.get(i - 1)));
                    }
                } else {
                    map.put(i - 1, map.get(i) + D);
                }
            }
        }
        return map.get(N);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            Solution solution = new Solution();
            System.out.println(solution.convert(N, A, B, C, D));
        }
    }

}