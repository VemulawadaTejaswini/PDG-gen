import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] T = sc.next().toCharArray();

        int x = 0;
        int y = K;

        boolean[] pick = new boolean[N];

        long ans = 0;
        for (int i = 0; i < K; i++) {
            if (T[i] == 'r') ans += P;
            if (T[i] == 's') ans += R;
            if (T[i] == 'p') ans += S;
            pick[i] = true;
        }
        while (y < N) {
            if (T[x] != T[y] || !pick[x]) {
                if (T[y] == 'r') ans += P;
                if (T[y] == 's') ans += R;
                if (T[y] == 'p') ans += S;
                pick[y] = true;
            }
            x++;
            y++;
        }

        System.out.println(ans);
    }
}
