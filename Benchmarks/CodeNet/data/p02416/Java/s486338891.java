import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    String INPUT = "";

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    void run() {
        Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
        PrintWriter out = new PrintWriter(System.out);

        solve(sc, out);
        out.flush();
    }

    void solve(Scanner sc, PrintWriter out) {
        String S = sc.nextLine();
        while (!"0".equals(S)) {
            int sum = 0;
            for (int i = 0; i < S.length(); i++) {
                sum += (int)S.charAt(i)-'0';
            }
            System.out.println(sum);
            S = sc.nextLine();
        }
    }
}

