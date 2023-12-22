
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] history = new char[N];
        // rock:     r
        // scissors: s
        // paper:    p

        char[] T = sc.next().toCharArray();
        char[] W = new char[T.length];
        int score = 0;
        // A greedy method.
        for (int i = 0; i < K; i++) {
            // build partial charactors.
            StringBuilder sb = new StringBuilder();
            for (int t = i; t < N; t += K) {
                sb.append(T[t]);
            }

            char[] s = sb.toString().toCharArray();
            boolean suc = false; // Same chars succeed.
            for (int j = 0; j < s.length; j++)  {
                char c = s[j];
                if (suc) {
                    suc = false;
                } else {
                    if (j > 0 && s[j] == s[j - 1]) {
                        suc = true;
                        continue;
                    }
                }

                if (c == 'r') score += P;
                if (c == 's') score += R;
                if (c == 'p') score += S;
            }
        }

        System.out.println(score);

    }
}
