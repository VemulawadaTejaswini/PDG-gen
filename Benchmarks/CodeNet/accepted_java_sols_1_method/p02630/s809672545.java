import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        HashMap<Long, Long> numCount = new HashMap<>();
        long sum = 0;
        for (var i=0; i<N; i++) {
            long a = sc.nextLong();
            sum+= a;
            if (numCount.containsKey(a))
                numCount.put(a, numCount.get(a) + 1);
            else
                numCount.put(a, (long) 1);
        }
        long Q = sc.nextLong();
        for (var i=0; i<Q; i++) {
            long b = sc.nextLong();
            long c = sc.nextLong();
            long bCount = numCount.getOrDefault(b, (long) 0);
            long cCount = numCount.getOrDefault(c, (long) 0);

            sum += (c - b) * bCount;
            numCount.put(b, (long)0);
            numCount.put(c, bCount + cCount);
            System.out.println(sum);
        }
    }
}