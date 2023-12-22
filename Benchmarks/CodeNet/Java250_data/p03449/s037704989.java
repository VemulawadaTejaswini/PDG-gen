import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[][] a = new int[2][N];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] s = new int[2][N+1];
        s[0][0] = 0;
        for (int i = 0; i < N; i++) {
            s[0][i+1] = s[0][i]+ a[0][i];
            s[1][i+1] = s[1][i]+ a[1][i];
        }
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            int t = s[0][i]-s[0][0] + s[1][N]-s[1][i-1];
            answer = Math.max(t, answer);
        }
        System.out.println(answer);
    }
}
