import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == 'A') {
                a = i + 1;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (c[i] == 'Z') {
                b = i + 1;
                break;
            }
        }
        System.out.println(b - a + 1);
    }
}