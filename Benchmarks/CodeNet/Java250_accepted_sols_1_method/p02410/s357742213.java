import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int[][] vector1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            lines = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                vector1[i][j] = Integer.parseInt(lines[j]);
            }
        }
        int[] vector2 = new int[m];
        for (int i = 0; i < m; i++) {
            vector2[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=vector1[i][j]*vector2[j];
            }
            System.out.println(sum);
        }

    }
}