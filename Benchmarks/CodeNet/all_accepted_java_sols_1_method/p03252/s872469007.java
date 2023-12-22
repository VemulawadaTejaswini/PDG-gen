import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        char[] c = new char[26];
        char[] c2 = new char[26];
        for (int i = 0; i < 26; i++) {
            c[i] = '0';
            c2[i] = '0';
        }

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (c[sChar - 97] == '0') {
                c[sChar - 97] = tChar;
            } else if (c[sChar - 97] != tChar) {
                System.out.println("No");
                return;
            }

            if (c2[tChar - 97] == '0') {
                c2[tChar - 97] = sChar;
            } else if (c2[tChar - 97] != sChar) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
