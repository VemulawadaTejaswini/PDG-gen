import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]v = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                v[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < n; j++) {
            int tmp1 = v[0][j];
            int tmp2 = v[1][j];
            if(tmp1 - tmp2 > 0) {
                sum1 += tmp1;
                sum2 += tmp2;
            }
        }
        System.out.println(sum1 - sum2);
    }
}