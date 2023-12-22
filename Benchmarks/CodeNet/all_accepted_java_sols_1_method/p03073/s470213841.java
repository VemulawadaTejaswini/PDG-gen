import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = s.clone();

        int front = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] == s[i + 1]) {
                if (s[i + 1] == '0') {
                    s[i + 1] = '1';
                } else {
                    s[i + 1] = '0';
                }
                front++;
            }
        }

        int back = 0;
        for (int i = t.length - 1; i > 0; i--) {
            if (t[i] == t[i - 1]) {
                if (t[i - 1] == '0') {
                    t[i - 1] = '1';
                } else {
                    t[i - 1] = '0';
                }
                back++;
            }

        }

        System.out.println(Math.min(front, back));
    }
}