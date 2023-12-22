import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        String[] arr = scanner.nextLine().split(" ");

        long[] aArray = new long[n];
        Map<Long, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(arr[i]);
            aArray[i] = num;
            if (map.containsKey(num)) {
                Long count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1L);
            }
        }

        long total = 0;
        for (Long key : map.keySet()) {
            Long j = map.get(key);
            total += j * (j - 1) / 2;
        }

        for (int k = 1; k <= n; k++) {

            long num = aArray[k - 1];
            long count = map.get(num);
            long diff = count - 1;
            System.out.println(total - diff);
        }
    }
}
