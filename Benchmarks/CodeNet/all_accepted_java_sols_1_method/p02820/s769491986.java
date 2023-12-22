import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();
        sc.close();

        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            char t = T.charAt(i);
            if (K <= i && T.charAt(i - K) == t && p[i - K] != 0) {
                p[i] = 0;
            } else if (t == 'r') {
                p[i] = P;
            } else if (t == 's') {
                p[i] = R;
            } else {
                p[i] = S;
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) ans += p[i];
        System.out.println(ans);
    }
}