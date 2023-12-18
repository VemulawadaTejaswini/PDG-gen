import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] L = new long[N + 1];
        L[0] = 2;
        L[1] = 1;

        for (int i = 2; i < N + 1; i++) {
            L[i] = L[i - 1] + L[i - 2];
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(L[N]);

        sc.close();
        out.flush();
    }
}