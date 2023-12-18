import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] g    = new int[n+1][n+1];
        int[] find   = new int[n+1];
        int[] finish = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                g[u][v] = 1;
            }
        }
        
        Deque<Integer> deq = new ArrayDeque<Integer>();
        int time = 0;
        for (int k = 1; k <= n; k++ ) {
            if (find[k] != 0) continue;
            
            deq.push(k);
            while(!deq.isEmpty()) {
                int top = deq.peek();
                if (find[top] == 0) find[top] = ++time;
                
                int j;
                for (j = 1; j <= n; j++) {
                    if (g[top][j] == 1 && find[j] == 0) {
                        deq.push(j);
                        find[j] = ++time;
                        break;
                    }
                }
                if (j == n + 1) {
                    deq.pop();
                    finish[top] = ++time;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + find[i] + " " + finish[i]);
        }
    }
}


