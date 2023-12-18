import java.util.*;

public class Main{
    static int n;
    static Scanner sc = new Scanner(System.in);
    static int[] Adj;
    static int[][] V;
    static StringBuilder sb = new StringBuilder();
    static String crlf = System.getProperty("line.separator");


    public static void main(String[] args){
        n = sc.nextInt();
        Adj = new int[n];
        V = new int[n][n];
        int m;
        for(int i=0; i<n; i++){
            Adj[i] = sc.nextInt();
            m = sc.nextInt();
            for(int j=0; j<m; j++){
                V[Adj[i]-1][sc.nextInt()-1] = 1;
            }
            for(int j=0; j<n; j++){
                sb.append(V[Adj[i]-1][j]);
                if(j!=n-1){
                    sb.append(" ");
                }
            }
            sb.append(crlf);
        }
        System.out.print(sb.toString());

    }
}
