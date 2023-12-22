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

        boolean result = true;
        for (int i = N - 2; i >= 0; i--) {
            if (H[i] <= H[i + 1]) {
                continue;
            }
            if (H[i] - 1 == H[i + 1]) {
                H[i]--;
            } else {
                result = false;
                break;
            }
        }

        if (result) {
            out.printf("Yes\n");
        } else {
            out.printf("No\n");
        }
        out.flush();
    }
}
