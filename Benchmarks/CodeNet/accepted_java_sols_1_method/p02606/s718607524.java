import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int result = 0;

        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                result++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);
        out.flush();
        sc.close();
    }
}