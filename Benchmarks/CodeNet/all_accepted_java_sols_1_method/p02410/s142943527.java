import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int row = Integer.parseInt(ar[0]);
        int col = Integer.parseInt(ar[1]);
        int[][] a = new int[row][col];
        int[] b = new int[col];
        for(int i = 0; i < a.length; i++){
            ar = br.readLine().split(" ");
            for(int n = 0; n < a[i].length; n++){
                a[i][n] = Integer.parseInt(ar[n]);
            }
        }
        for(int i = 0; i < b.length; i++){
            b[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < a.length; i++){
            int ans = 0;
            for(int n = 0; n < a[i].length; n++){
                ans += a[i][n] * b[n];
            }
            System.out.println(ans);
        }
    }
}