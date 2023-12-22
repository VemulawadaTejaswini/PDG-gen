import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        PrintWriter out = new PrintWriter(System.out);
        if (N < 1000) {
            out.println(1000 - N);
            sc.close();
            out.flush();
            return;
        }

        int x = 0;
        x = (int) Math.ceil((double) N / 1000);

        out.println(1000 * x - N);
        sc.close();
        out.flush();
    }
}