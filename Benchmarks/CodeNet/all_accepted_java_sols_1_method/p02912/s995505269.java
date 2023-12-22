import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Long> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            q.offer(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            q.offer(q.poll() / 2);
        }
        System.out.println(q.stream().mapToLong(Long::longValue).sum());
    }
}
