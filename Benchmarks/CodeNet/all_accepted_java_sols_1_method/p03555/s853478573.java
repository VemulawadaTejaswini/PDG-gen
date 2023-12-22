import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String[] S = new String[2];
        S[0] = sc.next();
        S[1] = sc.next();

        if (S[0].charAt(0) == S[1].charAt(2) &&
            S[0].charAt(1) == S[1].charAt(1) &&
            S[0].charAt(2) == S[1].charAt(0)) {
            out.printf("YES\n");
        }
        else {
            out.printf("NO\n");
        }
        out.flush();
    }
}
