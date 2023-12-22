import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(sc.next());
            }
        }

        int N = Integer.parseInt(sc.next());
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < N; k++) {
                    if (A[i][j] == b[k]) {
                        A[i][j] = -1;
                    }
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < 3; i++) {
            if (A[i][0] == -1 && A[i][1] == -1 && A[i][2] == -1) {
                out.println("Yes");
                out.flush();
                sc.close();
                return;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (A[0][j] == -1 && A[1][j] == -1 && A[2][j] == -1) {
                out.println("Yes");
                out.flush();
                sc.close();
                return;
            }
        }

        if (A[0][0] == -1 && A[1][1] == -1 && A[2][2] == -1
                || A[0][2] == -1 && A[1][1] == -1 && A[2][0] == -1) {
            out.println("Yes");
            out.flush();
            sc.close();
            return;
        }

        out.println("No");
        out.flush();
        sc.close();
    }
}