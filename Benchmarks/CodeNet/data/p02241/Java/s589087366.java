import java.util.Scanner;

public class Main {
    static int WHITE = 0;
    static int GRAY = 1;
    static int BLACK = 2;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] G = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                G[i][j] = input.nextInt();
            }
        }
        int[] p = new int[n];
        int[] d = new int[n];
        int[] color = new int[n];

        // 初始化
        for(int i = 0; i < n; i++) {
            d[i] = Integer.MAX_VALUE;
            p[i] = - 1;
            color[i] = WHITE;
        }

        d[0] = 0;
        int totalCost = 0;

        // 不断添加点，直到所有点都加入MST中
        while(true) {
            int minCost = Integer.MAX_VALUE;
            int u = 0;
            // 找到当前T内顶点与V-T内顶点的的边中最小的边
            for(int i = 0; i < n; i++){
                if(color[i] != BLACK && d[i] < minCost) {
                    minCost = d[i];
                    u = i;
                }
            }
            if(minCost == Integer.MAX_VALUE) {
                break;
            }
            // 将对应顶点和边加入T
            color[u] = BLACK;
            totalCost += minCost;

            // 更新新顶点加入后T内顶点与V-T内顶点的边的距离
            for(int v = 0; v < n; v++){
                if(color[v] != BLACK && G[u][v] != -1) {
                    if(G[u][v] < d[v]) {
                        d[v] = G[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }
                }
            }
        }
        System.out.println(totalCost);
    }
}

