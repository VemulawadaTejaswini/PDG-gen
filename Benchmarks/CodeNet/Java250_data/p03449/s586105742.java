
import java.util.*;

public class Main {

    static boolean[] bits;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] sum = new int[2][n+1];
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < n+1; j++) {
                sum[i][j] = sum[i][j - 1] + sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,sum[0][i+1]+sum[1][n]-sum[1][i]);
        }
        System.out.println(ans);
    }

}
