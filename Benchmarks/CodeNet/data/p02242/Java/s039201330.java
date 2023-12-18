import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        M = new int[n][n];
        d = new int[n];
        p = new int[n];
        color = new int[n];

        for(int i = 0 ; i < n ; i ++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int m = 0; m < n ; m ++){
                M[u][m] = INFTY;
            }
            for(int j = 0 ; j < k ; j ++){
                int v = sc.nextInt();
                int w = sc.nextInt();
                M[u][v] = w;
            }

            d[i] = INFTY;
            p[i] = -1;
        }

        dijkstra(0);

        for(int i = 0 ; i < n ; i ++){
            System.out.print(i + " " + d[i]);
            System.out.println();
        }
    }


    static int[][] M;
    static int n;
    static int[] d;
    static int[] p;
    static int[] color;
    static final int INFTY = 1 << 21;
    static final int WHITE = 0;
    static final int GRAY = 1;
    static final int BLACK = 2;


    static void dijkstra(int s){
        d[s] = 0;
        color[s] = GRAY;

        int minv,u;
        while (true){
            u = -1;
            minv = INFTY;
            for(int i = 0 ; i < n; i ++){
                if(color[i] != BLACK && minv > d[i]){
                    minv = d[i];
                    u = i;
                }
            }

            if(minv == INFTY){
                break;
            }

            color[u] = BLACK;

            for(int v = 0 ; v < n; v ++){
                if(color[v] != BLACK && M[u][v] != INFTY){
                    if(d[u] + M[u][v] < d[v]){
                        d[v] = d[u] + M[u][v];
                        color[v] = GRAY;
                        p[v] = u;
                    }
                }
            }
        }
    }

}

