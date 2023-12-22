import java.io.InputStream;
import java.util.Scanner;

/**
 * Created on 2017/10/29.
 */
public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray(); //?,t,c,?,?,?,?
        char[] t = sc.nextLine().toCharArray(); //c,o,d,e,r
        int SLength = s.length;
        int TLength = t.length;
        boolean b = false;
        outer:
        for (int i = SLength - TLength; i >= 0; i--) {
            for (int j = 0; j < TLength; j++) {
                if (s[i + j] != '?' && s[i + j] != t[j]) {
                    continue outer;
                }
            }
            for (int j = 0; j < TLength; j++) {
                s[i + j] = t[j];
            }
            b = true;
            break;
        }

        if (b) {
            for (int i = 0; i < SLength; i++) {
                if (s[i] == '?')
                    s[i] = 'a';
            }
            System.out.println(s);
        } else {

            System.out.println("UNRESTORABLE");
        }
    }
}

