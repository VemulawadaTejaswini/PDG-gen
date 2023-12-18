import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 1; i <= B; i++) {
            if (A * i % B == C) {
                out.println("YES");
                sc.close();
                out.flush();
                return;
            }
        }

        out.println("NO");
        sc.close();
        out.flush();
    }
}