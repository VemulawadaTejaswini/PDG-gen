import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr1 = br.readLine().split(" ");
            int n = Integer.parseInt(arr1[0]), m = Integer.parseInt(arr1[1]);
            // int n = 3, m = 4;

            int[][] A = new int[n][m];
            int[] b = new int[m];
            // A
            // String[] hoge = {"1 2 0 1", "0 3 0 1","4 1 1 0"};
            for(int i=0; i<n; i++) {
                String[] arr2 = br.readLine().split(" ");
                // String[] arr2 = hoge[i].split(" ");
                for(int j=0;j<m;j++){
                    A[i][j] = Integer.parseInt(arr2[j]);
                }
            }
            // b
            // int[] fuga = {1, 2, 3, 0};
            for(int i=0; i<m; i++) {
                b[i] = Integer.parseInt(br.readLine());
                // b[i] = fuga[i];
            }
            
            for(int i=0; i<n; i++) {
                int tmp = 0;
                for(int j=0; j<m; j++){
                    tmp += A[i][j]*b[j];
                }
                System.out.printf("%d\n", tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
