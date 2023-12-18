import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        M = new int[n][n];
        d = new int[n];
        p = new int[n];
        color = new int[n];

        for(int i = 0; i < n ; i ++){
            p[i] = -1;
            d[i] = INFTY;
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n; j ++){
                int e = sc.nextInt();
                M[i][j] = e == -1 ? INFTY : e;
            }
        }

        System.out.println(prime());
    }

    static int[][] M;
    static int[] color;
    static int[] d;
    static int[] p;
    static int n;
    static final int INFTY = 1 << 21;
    static final int WHITE = 0;
    static final int GRAY = 1;
    static final int BLACK = 2;



   static int prime(){
        d[0] = 0;
        int minv,u;
        while (true) {
            minv = INFTY;
            u = - 1;
            for(int i = 0 ; i < n ; i ++){
                if(color[i] != BLACK && minv > d[i]){
                   minv = d[i];
                   u = i;
                }
            }


            if(u == -1) break;

            color[u] = BLACK;

            for(int v = 0 ; v < n ; v ++){
                if(color[v] != BLACK && M[u][v] != INFTY){
                    if(d[v] > M[u][v]){
                        d[v] = M[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }

                }
            }
        }


        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            if(p[i] > -1){
                sum += M[i][p[i]];
            }
        }
        return sum;
    }
}

