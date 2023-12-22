import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] d = new int[N][2];
        for (int i = 0; i < N; i++) {
            d[i][0] = sc.nextInt();
            d[i][1] = sc.nextInt();
        }
        Arrays.sort(d, (x, y) -> x[0] - y[0]);
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if(d[i][1] <= M){
                M -= d[i][1];
                ans += (long)d[i][0] * d[i][1];
            }else {
                ans += (long)d[i][0] * M;
                M = 0;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
