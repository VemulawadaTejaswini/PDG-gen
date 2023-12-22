import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// ソースコードの数
        int m = sc.nextInt();// 整数の数
        int c = sc.nextInt();// 定数C

        int[] bArr = new int[m];
        int[][] aArr = new int[n][m];

        for (int i = 0; i < m; i++) {
            bArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                aArr[i][j] = sc.nextInt();
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += aArr[i][j] * bArr[j];
            }
            sum += c;
            if (sum > 0) res++;
        }

        System.out.println(res);
    }
}
