import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.next();
        String t = in.next();

        int idx = -1;
        for (int i = 0; i < ss.length(); i++) {
            int c = 0;
            for (int j = 0; j < t.length(); j++) {
                if (i + j < ss.length() && (ss.charAt(i + j) == '?' || ss.charAt(i + j) == t.charAt(j))) {
                    c++;
                }
            }
            if (c == t.length()) idx = i;
        }
        if (idx == -1) {
            System.out.println("UNRESTORABLE");
            return;
        }
        char[] s = ss.toCharArray();
        for (int i = idx, j = 0; i < ss.length() && j < t.length(); i++, j++) {
            s[i] = t.charAt(j);
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '?') s[i] = 'a';
        }
        System.out.println(new String(s));
    }
}
