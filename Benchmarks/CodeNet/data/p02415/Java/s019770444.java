import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.nextLine();

        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (Character.isLetter(s)) {
                if (Character.isUpperCase(s)) {
                    ans += String.valueOf(Character.toLowerCase(s));
                } else {
                    ans += String.valueOf(Character.toUpperCase(s));
                }
            } else {
                ans += String.valueOf(s);
            }
        }

        out.printf("%s\n", ans);
        out.flush();
    }
}
