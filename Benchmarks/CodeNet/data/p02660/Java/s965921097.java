import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        if (n != 1) {
            List<Integer> list = primeFactorization(n);
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }

            int[] count = new int[40];
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i - 1] + i;
            }

            for (int key : map.keySet()) {
                int val = map.get(key);
                for (int i = 0; i < count.length; i++) {
                    if (val < count[i]) {
                        result += i - 1;
                        break;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);

    }

    public static List<Integer> primeFactorization(long num) {
        List<Integer> list = new ArrayList<>();
        int max = (int) Math.sqrt(num);
        PriorityQueue<Integer> pq = new PriorityQueue<>(primeList(max));
        int div = pq.poll();
        while (num != 1) {
            if (num % div == 0) {
                num /= div;
                list.add(div);
            } else if (pq.isEmpty()) {
                break;
            } else {
                div = pq.poll();
            }
        }
        if (num != 1) {
            list.add((int) num);
        }
        return list;
    }

    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i])
                continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i])
                list.add(i);
        }
        return list;
    }
}
