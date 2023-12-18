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
        int len = 'z'-'a';
        int cnt[] = new int[len+1];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)-'a' >= 0 && S.charAt(i)-'a' <= len) cnt[(int)(S.charAt(i)-'a')]++;
            if (S.charAt(i)-'A' >= 0 && S.charAt(i)-'A' <= len) cnt[(int)(S.charAt(i)-'A')]++;
        }
        for (int i = 0; i <= len; i++) {
            System.out.println((char)('a'+i) + " : " + cnt[i]);
        }
    }
}

