import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final String INF = "~";
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        while(true) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            int g = sc.nextInt();
            if (n == 0) {
                break;
            }
            ArrayList<Edge>[] edge = new ArrayList[n];
            for(int i=0;i<n;i++) {
                edge[i] = new ArrayList<Edge>();
            }
            for(int i=0;i<a;i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                String c = sc.next();
                edge[x].add(new Edge(y,c));
            }
            String[] cost = new String[n];
            Arrays.fill(cost, INF);
            cost[g] = "";
            for(int k=0;k<=6*n;k++) {
                for(int i=0;i<n;i++) {
                    for(Edge e:edge[i]) {
                    	if (cost[e.to] == INF) {
                    		continue;
                    	}
                        cost[i] = min(cost[i], e.cost + cost[e.to]);
                    }
                }
            }
            if (cost[s] == INF || cost[s].length() >= 6 * n) {
                System.out.println("NO");
            }else{
                System.out.println(cost[s]);
            }
            System.gc();
        }
    }

    static class Edge {
        int to;
        String cost;
        public Edge(int to,String cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static String min(String a,String b) {
        return a.compareTo(b) < 0 ? a : b;
    }
}