import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int a_score = 0;
        int b_score = 0;
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            if (a.compareTo(b) < 0) {
                b_score += 3;
            } else if (a.compareTo(b) > 0) {
                a_score += 3;
            } else {
                a_score++;
                b_score++;
            }
        }
        out.printf("%d %d\n", a_score, b_score);
        out.flush();
    }
}
