import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n][];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt()-1;
            int k = sc.nextInt();
            g[v] = new int[k];
            for (int j = 0; j < k; j++) {
                g[v][j] = sc.nextInt()-1;
            }
        }
        int[] a = new int[n];
        Arrays.fill(a, -1);
        a[0] = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int b : g[0]) q.add(b);
        for (int i = 1; i < n; i++) {
            ArrayDeque<Integer> nexq = new ArrayDeque<>();
            while(!q.isEmpty()){
                int nex = q.poll();
                if(0 <= a[nex])continue;
                a[nex] = i;
                for(int c : g[nex]) nexq.add(c);
            }
            q.addAll(nexq);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int v = i+1;
            sb.append(v + " " + a[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}

