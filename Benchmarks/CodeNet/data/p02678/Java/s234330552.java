import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

         String[] tmp = br.readLine().split(" ");
         int n = Integer.parseInt(tmp[0]);
         int m = Integer.parseInt(tmp[1]);

         List<List<Integer>> g = new ArrayList<>(n);
         for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
         }

         for (int i = 0; i < m; i++) {
            tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]) - 1;
            int b = Integer.parseInt(tmp[1]) - 1;
            g.get(a).add(b);
            g.get(b).add(a);
         }

         int[] ans = new int[n];

         Queue<Integer> q = new ArrayDeque<>();
         q.offer(0);
         while (!q.isEmpty()) {
            int p = q.poll();
            for (int v : g.get(p)) {
               if (ans[v] == 0) {
                  ans[v] = p + 1;
                  q.add(v);
               }
            }
         }

         PrintWriter pw = new PrintWriter(System.out);
         pw.println("Yes");
         for (int i = 1; i < n; i++) {
            pw.println(ans[i]);
         }
         pw.flush();

      }
   }
}