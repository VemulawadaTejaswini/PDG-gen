import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int k = 0;
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {

                k = N - i - j;
                if (10000 * i + 5000 * j + 1000 * k == Y) {
                    out.println(i + " " + j + " " + k);
                    sc.close();
                    out.flush();
                    return;
                }
            }
        }

        out.println("-1 -1 -1");

        sc.close();
        out.flush();
    }
}