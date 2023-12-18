import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        int n = in.nextInt();
        while(n != 0){
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = in.nextInt();
                }
            }
            int[] cSum = new int[n];
            for(int i = 0; i < n; i++){
                int rSum = 0;
                for(int j = 0; j < n; j++){
                    rSum += a[i][j];
                    cSum[j] += a[i][j];
                    System.out.printf("%5d", a[i][j]);
                }
                System.out.printf("%5d\n", rSum);
            }
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += cSum[i];
                System.out.printf("%5d", cSum[i]);
            }
            System.out.printf("%5d\n", sum);
            n = in.nextInt();
        }
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}