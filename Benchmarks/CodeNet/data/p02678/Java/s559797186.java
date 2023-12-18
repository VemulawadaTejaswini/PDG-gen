import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            list.get(a[i]).add(b[i]);
            list.get(b[i]).add(a[i]);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        int[] seen = new int[n];
        seen[0] = 1;
        int[] dist = new int[n];

        Arrays.fill(dist, 10000000);
        dist[0] = 0;
        queue.add(0);
        while (queue.size() != 0) {
            int state = queue.peek();
            int now = queue.poll();
            for (int x : list.get(state)) {
                if (seen[x] == 0) {
                    seen[x] = 1;
                    queue.add(x);
                    dist[x] = dist[now] + 1;
                }
            }
        }
        for (int i = 0 ; i < n ; i++) {
            if (dist[i] >= 10000000) {
                System.out.print("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int i = 1 ; i < n ; i++) {
            int d = dist[i];
            int ans = 0;
            for (int x : list.get(i)) {
                if (dist[x] == d - 1) {
                    ans = x + 1;
                }
            }
            System.out.println(ans);
        }
    }

}
