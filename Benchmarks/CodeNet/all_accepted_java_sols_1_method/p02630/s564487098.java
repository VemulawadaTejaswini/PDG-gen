import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Long> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            Long key = sc.nextLong();
            Long count = map.getOrDefault(key, 0L);
            map.put(key, ++count);
            sum += key;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            Long b = sc.nextLong();
            Long c = sc.nextLong();

            Long bCount = map.getOrDefault(b, 0L);
            long tmp = sum - (b * bCount) + (c * bCount);
            System.out.println(tmp);
            map.put(b, 0L);
            long cCount = map.getOrDefault(c, 0L);
            map.put(c, bCount + cCount);
            sum = tmp;
        }
    }
}