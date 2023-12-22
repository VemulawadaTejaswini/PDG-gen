import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int max = 0;
        int move = 0;
        for (int i = 0; i < N - 1; i++) {
            if (H[i] < H[i + 1]) {
                if (max < move) {
                    max = move;
                }
                move = 0;
                continue;
            }
            move++;
        }
        if (max < move) {
            max = move;
        }

        out.printf("%d\n", max);
        out.flush();
    }
}
