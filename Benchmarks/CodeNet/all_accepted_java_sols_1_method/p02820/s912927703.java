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
        char[] cr = T.toCharArray();
        long score = 0l;
        for (char c : cr) {
            if (c == 'r') {
                score += P;
            } else if (c == 's') {
                score += R;
            } else if (c == 'p') {
                score += S;
            }
        }
        char tmp = 0;
        for (int i = K; i < N; i++) {
            char c = cr[i];
            tmp = cr[i-K];
            if (c == tmp) {
                if (c == 'r') {
                    score -= P;
                } else if (c == 's') {
                    score -= R;
                } else if (c == 'p') {
                    score -= S;
                }
                cr[i] = 0;
            }
        }
        System.out.println(score);
    }
}