import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        int ans = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < d; j++)
                x[i][j] = sc.nextInt();
            
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int distance = 0;
                for (int k = 0; k < d; k++) {
                    distance += Math.pow(x[j][k]-x[i][k], 2);
                }
                if (Math.sqrt(distance) - (int)Math.sqrt(distance) == 0)
                    ans ++;
            }
        }
        System.out.println(ans);
    }
}
