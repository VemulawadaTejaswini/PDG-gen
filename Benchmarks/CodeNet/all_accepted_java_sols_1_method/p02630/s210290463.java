import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        List<Long> list = new ArrayList<>();
        long sum = 0;
        Map<Long, Long> distmap = new HashMap<>();

        for (long i = 0; i < n; i++) {
            long a = scanner.nextLong();
            list.add(a);
            if (!distmap.containsKey(a)) {
                distmap.put(a, 0L);
            }
            distmap.put(a, distmap.get(a) + 1);
            sum += a;
        }

        long q = scanner.nextLong();

        for (long i = 0; i < q; i++) {
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long diff = c - b;

            long bfreq = distmap.getOrDefault(b, 0L);
            long cfreq = distmap.getOrDefault(c, 0L);

            if (bfreq == 0) {
                System.out.println(sum);
                continue;
            }
            distmap.put(b, 0L);
            distmap.put(c, cfreq + bfreq);
            sum = sum + (diff * bfreq);
            System.out.println(sum);
        }

    }
}