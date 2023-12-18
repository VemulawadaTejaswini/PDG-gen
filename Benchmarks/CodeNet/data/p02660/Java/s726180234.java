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
        int div = 2;
        while (div <= max) {
            if (num % div == 0) {
                num /= div;
                list.add(div);
            } else {
                div++;
            }
        }
        if (num != 1) {
            list.add((int) num);
        }
        return list;
    }
}
