import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int l = Integer.parseInt(line[2]);
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        long[][] c = new long[n][l];

        for(int i = 0; i < n; i++){
            line = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i = 0; i < m; i++){
            line = br.readLine().split(" ");
            for(int j = 0; j < l; j++){
                b[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                for(int k = 0; k < m; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                System.out.print(c[i][j]);
                if(j != l-1)
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}