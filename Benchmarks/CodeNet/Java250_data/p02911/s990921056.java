import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] scores = new int[N];
        int Q = Integer.parseInt(sc.next());
        for (int i = 0; i < N; i++) {
            scores[i] = K - Q;
        }

        for (int i = 0; i < Q; i++ ) {
            scores[Integer.parseInt(sc.next())-1]++;
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            if (scores[i] > 0) {
                out.printf("Yes\n");
            } else {
                out.printf("No\n");
            }
        }
        out.flush();
    }
}
