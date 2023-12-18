import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int[] b = new int[m];
        //        int[][] a = new int[n][m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                sum += num * b[j];
            }
            sum += c;
            if (sum > 0) {
                cnt++;
            }
        }

        sc.close();

        System.out.println(cnt);
    }

}