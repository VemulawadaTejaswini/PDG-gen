import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int L = sc.nextInt();
            pq.offer(X);
            map.put(X, L);
        }

        int ans = 1;
        int prevX = pq.poll();
        int prevL = map.get(prevX);
        while (!pq.isEmpty()) {
            int X = pq.poll();
            int L = map.get(X);
            if (X+L <= prevX+prevL) {
                prevX = X;
                prevL = L;
            } else if (prevX+prevL <= X-L) {
                prevX = X;
                prevL = L;
                ans++;
            }
        }


        System.out.println(ans);
    }
}
