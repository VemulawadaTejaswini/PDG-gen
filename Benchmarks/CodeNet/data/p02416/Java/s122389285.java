import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while(true) {
            String S = sc.next();
            int sum = 0;
            if (S.length() == 1 && Integer.parseInt(S) == 0) {
                break;
            }
            for (int i = 0; i < S.length(); i++) {
                sum += Integer.parseInt(S.substring(i, i+1));
            }
            out.printf("%d\n", sum);
        }
        out.flush();
    }
}
