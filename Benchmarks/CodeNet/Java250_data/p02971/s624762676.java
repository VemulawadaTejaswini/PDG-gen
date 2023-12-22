import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int max = -1;
        int max_index = -1;
        int second = -1;
        int second_index = -1;
        for (int i = 0; i < N; i++) {
            if (max < A[i]) {
                second = max;
                second_index = max_index;
                max = A[i];
                max_index = i;
            } else if (second < A[i]) {
                second = A[i];
                second_index = i;
            }
        }

        for (int i = 0; i < N; i++) {
            if (max_index == i) {
                out.printf("%d\n", A[second_index]);
            }
            else {
                out.printf("%d\n", A[max_index]);
            }
        }
        out.flush();
    }
}
