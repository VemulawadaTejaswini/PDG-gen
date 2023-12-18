import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

    private static final int INF = 10000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n==0&&m==0) {
                break;
            }
            String s = sc.next();
            String p = sc.next();
            String g = sc.next();
            
            int[][] path = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(path[i], INF);
            }
            
            String[] names = new String[n];
            Map<String, Integer> revmap = new HashMap<String, Integer>(n * 4 / 3 + 1);
            int numNames = 0;
            
            for (int i = 0; i < m; i++) {
                String a = sc.next();
                String b = sc.next();
                Integer ai = revmap.get(a);
                Integer bi = revmap.get(b);
                if (ai == null) {
                    ai = numNames;
                    names[numNames++] = a;
                    revmap.put(a, ai);
                }
                if (bi == null) {
                    bi = numNames;
                    names[numNames++] = b;
                    revmap.put(b, bi);
                }
                path[ai][bi] = path[bi][ai] = sc.nextInt() / 40 + sc.nextInt();
            }
            
            int pIndex = revmap.get(p);
            class State implements Comparable<State> {
                final int to;
                final int dist;
                
                public State(int to, int dist) {
                    this.to = to;
                    this.dist = dist;
                }

                @Override
                public int compareTo(State o) {
                    return o.dist - dist;
                }
            }
            
            int[] dists = new int[n];
            boolean[] visited = new boolean[n]; 
            PriorityQueue<State> pq = new PriorityQueue<State>(n, Collections.reverseOrder());
            pq.add(new State(pIndex, 0));
            
            while (!pq.isEmpty()) {
                State state = pq.poll();
                if(visited[state.to]) continue;
                visited[state.to] = true;
                dists[state.to] = state.dist;
                for (int i = 0; i < n; i++) {
                    if (!visited[i] && path[state.to][i] != INF) {
                        pq.add(new State(i, state.dist + path[state.to][i]));
                    }
                }
            }
            System.out.println(dists[revmap.get(s)] + dists[revmap.get(g)]);

        }
    }

}