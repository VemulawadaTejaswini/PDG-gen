import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(n, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            queue.add(std.nextInt());
        }
        int restCount = m;

        while (restCount != 0) {
            Integer price = queue.poll();
            Integer newPrice = (int) (price * 0.5);
            queue.add(newPrice);
            restCount--;
        }

        Iterator<Integer> it = queue.iterator();
        BigInteger ans = BigInteger.ZERO;

        while (it.hasNext()) {
            int price = it.next();
            ans = ans.add(BigInteger.valueOf(price));
        }

        System.out.println(ans);
    }
}