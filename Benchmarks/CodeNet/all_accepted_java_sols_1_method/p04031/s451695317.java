import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>(n);
        int m = 200, M = -200;
        for(int i = 0; i < n; ++i) {
            int t = Integer.parseInt(sc.next());
            list.add(t);
            m = Math.min(m, t);
            M = Math.max(M, t);
        }
        
        int ans = Integer.MAX_VALUE;
        for(int num = m; num <= M; ++num) {
            int cost = 0;
            for(int i = 0; i < n; ++i) {
                int changed = list.get(i);
                cost += (changed - num) * (changed - num);
            }
            ans = Math.min(ans, cost);
        }
        System.out.println(ans);
    }
}
