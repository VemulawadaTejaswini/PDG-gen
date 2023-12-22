import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int n = Integer.parseInt(ar[0]);
        int m = Integer.parseInt(ar[1]);
        int l = Integer.parseInt(ar[2]);
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        for(int i = 0; i < a.length; i++){
            ar = br.readLine().split(" ");
            for(int j = 0; j <a[i].length; j++){
                a[i][j] = Integer.parseInt(ar[j]);
            }
        }
        for(int i = 0; i < b.length; i++){
            ar = br.readLine().split(" ");
            for(int j = 0; j <b[i].length; j++){
                b[i][j] = Integer.parseInt(ar[j]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                long ans = 0;
                for(int k = 0; k < m; k++){
                    ans += a[i][k] * b[k][j];
                }
                if(j == l-1){
                    System.out.println(ans);
                }else{
                    System.out.print(ans+" ");
                }
            }
        }
    }
}