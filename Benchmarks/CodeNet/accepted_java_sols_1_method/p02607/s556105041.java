import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int result = 0;
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 != 0 && a[i] % 2 != 0) {
                result++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);
        out.flush();
        sc.close();
    }
}