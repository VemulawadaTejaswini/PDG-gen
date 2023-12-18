import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    void run() {
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        char[] a = Arrays.copyOf(s, s.length);
        System.out.println(check(s, t, a) || check(t, s, a) ? "Yes" : "No");
    }

    boolean check(char[] s, char[] t, char[] a) {
        boolean f = true;
        int index = 0;
        for (int i = 0, j = 0; i < s.length || j < t.length;) {
            if (f) {
                while (i < s.length) {
                    if (s[i++] == a[index]) {
                        index++;
                        f = !f;
                        break;
                    }
                }
                if (f) break;
            } else {
                while (j < t.length) {
                    if (t[j++] == a[index]) {
                        index++;
                        f = !f;
                        break;
                    }
                }
                if (!f) break;
            }
            if (index == a.length) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}