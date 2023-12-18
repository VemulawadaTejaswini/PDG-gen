import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n+1][n+1];
        for(int i = 0; i < n; i++){
            int u = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                int v = Integer.parseInt(sc.next());
                a[u][v] = 1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                sb.append(a[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
