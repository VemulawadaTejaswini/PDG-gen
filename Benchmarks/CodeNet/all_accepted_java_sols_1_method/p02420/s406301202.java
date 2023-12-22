import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while(true) {
            int sum = 0;
            String S = sc.next();
            if (S.equals("-")) {
                break;
            }
            int num = Integer.parseInt(sc.next());
            for (int i = 0; i < num; i++) {
                sum += Integer.parseInt(sc.next());
            }
            String ans = S + S;
            int shift = sum % S.length();
            out.printf("%s\n", ans.substring(shift, shift + S.length()));
        }
        out.flush();
    }
}
