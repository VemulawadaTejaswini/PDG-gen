import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                l[i][j] = sc.nextInt();
            }
        }
        int[] nn = new int[n+1];
        for (int i = 0; i < m; i++) {
            int s = l[i][0];
            int e = l[i][1];
            for (int j = s; j < e + 1; j++) {
                nn[j]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < nn.length; i++) {
            if(nn[i] == m) ans++;
        }
        System.out.println(ans);
    }
}