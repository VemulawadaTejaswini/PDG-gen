import java.util.*;

public class Main {
    
    static int[][] l;
    static int[] d;
    static int[] f;
    static int time = 1;
    
    static void dfs(int v){
        d[v] = time;
        time++;
        int j = 0;
        while(l[v][j] != 0){
            if(d[l[v][j]]== 0){
                dfs(l[v][j]);
            }
            j++;
        }
        f[v] = time;
        time++;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        l = new int[n + 1][100];
        d = new int[n + 1];
        f = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                int v = sc.nextInt();
                l[u][j] = v;
            }
        }
        for(int i = 1; i <= n; i++){
            if(d[i] == 0){
                dfs(i);
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + d[i] + " " + f[i]);
        }
    }
}

