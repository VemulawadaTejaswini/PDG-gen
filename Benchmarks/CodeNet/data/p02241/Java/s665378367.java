import java.io.*;
import java.util.*;

public class Main{
    public static int i, j, k;
    public static final int WHITE = 0;
    public static final int GRAY = 1;
    public static final int BLACK = 2;
    public static final int INF = 2147483647;
    public Main(){

    }
    public static void main(String[] args)throws IOException{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] input = new int[n][n];
        int ans;
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(i=0 ; i<n ; i++){
          //StringTokenizer S = new StringTokenizer(bf.readLine());
            for(j=0 ; j<n ; j++){
                int a = scan.nextInt();
                input[i][j] = (a == -1) ? INF : a;
                //input[i][j] = Integer.parseInt(S.nextToken());
            }
        }
        ans = prim(n, input);
        System.out.println(ans);
    }

    private static int prim(int n, int[][] G){
        int u;
        int minv;
        int[] color = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;
        for (i=0 ; i<n ; i++){
            a[i] = INF;
            b[i] = -1;
            color[i] = WHITE;
        }
        a[0] = 0;
        while(true){
            u = -1;
            minv = INF;
            for(i=0 ; i<n ; i++){
                if (a[i] < minv && color[i] != BLACK){
                    u = i;
                    minv = a[i];
                }
            }
            if(u == -1){break;}
            color[u] = BLACK;

            for(k=0 ; k<n ; k++){
                if(color[k] != BLACK && G[u][k] != INF){
                    if(a[k] > G[u][k]){
                        a[k] = G[u][k];
                        b[k] = u;
                        color[k] = GRAY;
                    }
                }
            }
        }
        for(i=0 ; i<n ; i++){
            if(b[i] != -1){sum += G[i][b[i]];}
        }

        return sum;
    }
}

