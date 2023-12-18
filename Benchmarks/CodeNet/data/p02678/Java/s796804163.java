import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        int n = Integer.parseInt(N);
        String M = scan.next();
        int m = Integer.parseInt(M);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            String A = scan.next();
            int a = Integer.parseInt(A);
            String B = scan.next();
            int b = Integer.parseInt(B);
            a--;
            b--;
            list.get(a).add(b);
            list.get(b).add(a);
        }
        System.out.println(list);

        Queue<Integer> q = new ArrayDeque<>();

        ArrayList<Integer> dist = new ArrayList<Integer>();
        int depth = n;
        for (int i = 0; i < n; i++) {
            dist.add(n);
        }
        System.out.println(dist);

        ArrayList<Integer> pre = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            pre.add(-1);
        }
        System.out.println(pre);

        dist.set(0, 0);
        q.add(0);
        while (q.peek() != null) {
            int v = q.poll();
            for (int u: list.get(v)) {
                if (dist.get(u) != n) continue;
                dist.set(u, dist.get(v) + 1);
                pre.set(u, v);
                q.add(u);
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < n; i++) {
            if (i == 0) continue;
            int ans = pre.get(i);
            ans++;
            System.out.println(ans);
        }
    }
}