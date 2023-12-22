import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static int[][] M;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        M = new int[n][n];
        int u, k;
        for(int i = 0; i < n; i++){
            String[] t = br.readLine().split(" ");
            u = Integer.parseInt(t[0]);
            u--;//for M[u][v]                                                      
            k = Integer.parseInt(t[1]);
            for(int j = 0; j < k; j++){
                int v = Integer.parseInt(t[j+2]);
                v--;//for M[u][v]                                                  
                M[u][v] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j != 0) sb.append(" ");
                sb.append(M[i][j]);

            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

}