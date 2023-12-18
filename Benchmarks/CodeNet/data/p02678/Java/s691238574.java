import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    List<Integer>[] lists = new ArrayList[n+1];

    //        2 ... n
    int[] res = new int[n+1];


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n+1; i++) lists[i] = new ArrayList<>();

        for (int i=0; i<m; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            lists[s].add(t);
            lists[t].add(s);
        }

//        System.out.println(lists[1]);

        bfs(1);

        int cnt = 0;

        for (int i=2; i<=n; i++) {
            if (res[i] != 0) cnt++;
        }

        if (cnt != n-1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (int i=2; i<=n; i++) {
                System.out.println(res[i]);
            }
        }



    }

    void bfs(int s) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            int t = queue.peek();
            for (int u: lists[t]) {
                if (res[u] == 0) {
                    res[u] = t;
                    queue.add(u);
                }
            }
            queue.poll();
        }
    }
}

