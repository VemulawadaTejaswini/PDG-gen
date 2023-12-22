import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int N = s.nextInt();
        int P[] = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = s.nextInt();
        }
        int Q[] = new int[102];
        Arrays.sort(P);
        int p = 0;
        for (int i = 0; i <= 101; i++) {
            if (p < N) {
                if (P[p] == i) {
                    p++;
                } else {
                    Q[i] = i;
                }
            } else {
                Q[i] = i;
            }
        }
        int ans = 0;
        int d = 200;
        int d_tmp = 0;
        for (int i = 0; i <= 101; i++) {
            d_tmp = X - Q[i];
            if (d_tmp < 0) {
                d_tmp *= -1;
            }
            if (d > d_tmp) {
                d = d_tmp;
                ans = Q[i];
            }
        }
        System.out.println(ans);
        s.close();
    }
}