import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            String command = sc.next();
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (command.equals("print")) {
                out.printf("%s\n", S.substring(a, b + 1)) ;
            } else if (command.equals("reverse")) {
                String T = S;
                S = T.substring(0, a);
                for (int j = b; j >= a; j--) {
                    S += T.substring(j, j + 1);
                }
                S += T.substring(b + 1);
            } else if (command.equals("replace")) {
                String replace = sc.next();
                S = S.substring(0, a) + replace + S.substring(b + 1);
            }
        }
        out.flush();
    }
}
