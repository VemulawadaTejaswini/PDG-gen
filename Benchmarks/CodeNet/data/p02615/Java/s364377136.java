import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        PriorityQueue<Long>queue = new PriorityQueue<Long>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i1 = 0; i1 < i; i1++) {
            queue.add(sc.nextLong());
        }

        Long cur = queue.poll();
        Long ans = 0L;
        while (!queue.isEmpty()){
            ans += cur;
            cur = queue.poll();
        }
        System.out.println(ans);
    }
}
