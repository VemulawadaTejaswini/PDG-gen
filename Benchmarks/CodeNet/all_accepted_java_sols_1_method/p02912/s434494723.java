import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        // 降順
        PriorityQueue<Integer> A = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(scanner.next()));
        }
        scanner.close();

        int useTicketCount = M;
        // 割引件を使い切る
        while (useTicketCount > 0) {
            int tmp = (int) Math.floor(A.remove() / 2.0);
            A.add(tmp);
            useTicketCount--;
        }

        long ans = 0;
        for (int n : A) {
            ans += n;
        }

        System.out.println(ans);
    }
}
