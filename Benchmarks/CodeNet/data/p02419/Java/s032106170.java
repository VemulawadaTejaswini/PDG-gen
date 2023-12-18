import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        String s = S.toLowerCase();

        int count = 0;
        while(true) {
            String T = sc.next();
            if (T.equals("END_OF_TEXT")) {
                break;
            }
            String t = T.toLowerCase();
            if (t.equals(s)) {
                count++;
            }
        }
        out.printf("%d\n", count);
        out.flush();
    }
}
