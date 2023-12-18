import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[] array = new long[a];

        Map<Long, Long> map = new HashMap<>();
        long originalSum = 0;
        for (int i=0; i<a; i++) {
            array[i] = sc.nextLong();
            originalSum+=array[i];
            if (map.containsKey(array[i])) map.put(array[i], map.get(array[i]) + 1);
            else map.put(array[i], 1L);
        }

        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (map.get(b) == null) {
                System.out.println(originalSum);
                continue;
            }

            long diff = (c - b) * map.get(b);
            originalSum += diff;
            System.out.println(originalSum);

            long countC = (map.get(c) != null) ? map.get(c) : 0;
            map.put(c, countC + map.get(b));
            map.put(b, 0L);
        }
    }
}
