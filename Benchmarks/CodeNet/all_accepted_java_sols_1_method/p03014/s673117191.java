import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] s = new char[n][m];
        for(int i = 0 ; i < n ; i++) s[i] = sc.next().toCharArray();
        // マス(n, m)より上or下or左or右にいくつの連続した空マスが存在するか
        int[][] top = new int[n][m];
        int[][] bottom = new int[n][m];
        int[][] left = new int[n][m];
        int[][] right = new int[n][m];
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < m; j++) {
                left[i][j] = cnt;
                if(s[i][j] == '.') cnt++;
                else cnt = 0;
            }
            cnt = 0;
            for(int j = m - 1; j >= 0; j--) {
                right[i][j] = cnt;
                if(s[i][j] == '.') cnt++;
                else cnt = 0;
            }
        }
        for(int i = 0; i < m; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                top[j][i] = cnt;
                if(s[j][i] == '.') cnt++;
                else cnt = 0;
            }
            cnt = 0;
            for(int j = n - 1; j >= 0; j--) {
                bottom[j][i] = cnt;
                if(s[j][i] == '.') cnt++;
                else cnt = 0;
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(s[i][j] == '.') {
                    ans = Math.max(ans, left[i][j] + right[i][j] + top[i][j] + bottom[i][j] + 1);
                }
            }
        }
        System.out.println(ans);
    }
}