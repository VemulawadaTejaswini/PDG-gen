import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        String p = sc.next();

        String S2 = S + S;
        boolean result = false;
        for (int i = 0; i < S2.length() - p.length() + 1; i++) {
            if (S2.substring(i).startsWith(p)) {
                result = true;
                break;
            }
        }
        if (result) {
            out.printf("Yes\n");
        } else {
            out.printf("No\n");
        }
        out.flush();
    }
}
