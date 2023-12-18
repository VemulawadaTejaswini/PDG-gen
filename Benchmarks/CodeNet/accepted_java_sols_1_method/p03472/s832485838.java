import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int aMax = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            aMax = Math.max(aMax, a);
            pq.offer(b);
        }

        int ans = 0;
        while (!pq.isEmpty() && H > 0) {
            int b = pq.poll();
            if (aMax > b) {
                break;
            }
            H -= b;
            ans++;
        }
        if (H > 0) {
            ans += H/aMax + (H%aMax == 0 ? 0 : 1);
        }

        System.out.println(ans);
    }
}
