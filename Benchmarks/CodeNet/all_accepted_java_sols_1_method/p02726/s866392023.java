import java.util.*;
import java.util.function.BiConsumer;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();    
        int X = stdIn.nextInt();    
        int Y = stdIn.nextInt();    
        stdIn.close();
        X--; Y--;
        int INF = 1001001001;
        int[] ans = new int[N];
        for (int sv = 0; sv < N; sv++) {
            int[] dist = new int[N];
            for (int i = 0; i < N; i++) {
                dist[i] = INF;
            }
            Queue<Integer> queue = new ArrayDeque<>();
            BiConsumer<Integer, Integer> push = (v, d) -> { 
                if (dist[v] != INF) return;
                dist[v] = d;
                queue.add(v);
            };
            push.accept(sv, 0);
            while(queue.peek() != null) {
                int v = queue.poll();
                int d = dist[v];
                if (v - 1 >= 0) push.accept(v - 1, d + 1);
                if (v + 1 < N) push.accept(v + 1, d + 1);
                if (v == X) push.accept(Y, d + 1);
                if (v == Y) push.accept(X, d + 1);
            }
            for (int i = 0; i < N; i++) {
                ans[dist[i]]++;
            }
        }
        for (int i = 0; i < N; i++) {
            ans[i] /= 2;
        }
        for (int i = 1; i <= N - 1; i++) {
            System.out.println(ans[i]);        
        }
    }
}