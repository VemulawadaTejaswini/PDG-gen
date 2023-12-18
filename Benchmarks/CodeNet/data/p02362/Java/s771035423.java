import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int s = sc.nextInt();
        int[][] edge = new int[e][3];
        for (int i = 0; i < e; i++) {
            edge[i][0] = sc.nextInt();
            edge[i][1] = sc.nextInt();
            edge[i][2] = sc.nextInt();
        }
        long[] ans = bellmanFord(v, edge, s);
        if(ans == null) System.out.println("NEGATIVE CYCLE");
        else for(long a : ans){
            if(a == Long.MAX_VALUE) System.out.println("INF");
            else System.out.println(a);
        }

        sc.close();

    }
    public static long[] bellmanFord(int n, int[][] edge, int s){
        long d[] = new long[n];
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < edge.length; j++){
                int[] e = edge[j];
                if(d[e[0]] != Long.MAX_VALUE && d[e[1]] > d[e[0]] + e[2]){
                    d[e[1]] = d[e[0]] + e[2];
                    if(i == n - 1){
                        d = null;
                        break;
                    }
                }
            }
        }
        return d;
    }

}

