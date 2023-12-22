import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int R;
        boolean Rflg = false;
        int count = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        while (Rflg == false) {
            for (int i = 0; i < N; i++) {
                R = A[i] % 2;
                if (R != 0) {
                    Rflg = true;
                    break;
                }
                A[i] = A[i] / 2;
                count++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count / N);

        sc.close();
        out.flush();
    }
}