import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{
    public static final int N = 100;//for input max <= 100                           
    public static final int WHITE = 0;
    public static final int GRAY = 1;
    public static final int BLACK = 2;
    public static int n, tt;
    public static int[] color = new int[N];
    public static int[] d = new int[N];
    public static int[] f = new int[N];
    public static int[] passCount = new int[N];
    public static int[][] M = new int[N][N];

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int u, k; //u is id, k is neighbor's num                                     
        for(int i = 0; i < n; i++){
            String[] t = br.readLine().split(" ");
            u = Integer.parseInt(t[0]);
            u--; //0 origin for M[][]                                                
            k = Integer.parseInt(t[1]);
            for(int j = 0; j < k; j++){
                int v = Integer.parseInt(t[j+2]);
                v--;
                M[u][v] = 1; //1 means u and v are connected                         
            }
        }
        //dfs();                                                                     
        System.out.print(dfs());
    }

    public static String dfs(){
        //????¨???????u????§??????¨????????±???????????¢?´¢                                          
        for(int u = 0; u < n; u++){
            if(color[u] == WHITE) dfs_visit(u);
        }
        //print                                                                      
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(i+1).append(" ").append(d[i]).append(" ").append(f[i])
                .append("\n");
        }
        //System.out.print(sb);                                                      
        //String t = sb.toString();                                                  
        return sb.toString();
    }
    //?????????????????¨????????±???????????¢?´¢                                                   
    public static void dfs_visit(int r){
        ArrayDeque<Integer> S = new ArrayDeque<>();
        S.addLast(r);
        color[r] = GRAY;
        d[r] = ++tt;

        while(!S.isEmpty()){
            int u = S.getLast();
            int v = next(u);
            if(v != -1){//if has next                                                
                if(color[v] == WHITE){//if no passed                                 
                    color[v] = GRAY;
                    d[v] = ++tt;
                    S.addLast(v);
                }
            }else{//if dont has next                                                 
                int trash = S.removeLast();
                color[v] = BLACK;
                f[u] = ++tt;
            }
        }
    }

    public static int next(int u){
        for(int v = passCount[u]; v < n; v++){
            passCount[u] = v + 1;
            if(M[u][v] == 1)return v;
        }
        return -1;
    }

}