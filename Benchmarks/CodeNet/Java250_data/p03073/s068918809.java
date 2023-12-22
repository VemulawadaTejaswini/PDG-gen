import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    // 10:33-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            String s = sc.next();
            out.println(Math.min(c(s, 0), c(s, 1)));
        }
    }

    private static int c(String s, int x) {
        int cost = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') != x) cost++;
            x = 1 - x;
        }
        return cost;
    }
}
