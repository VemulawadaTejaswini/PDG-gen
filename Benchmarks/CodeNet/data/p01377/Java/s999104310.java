import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    char[] input;
    char[] iwistr = { 'i', 'w', '(', ')' };
    int INF = 1 << 28;
    int min = INF;

    void run() {
        solve(0, sc.next().toCharArray(), 0);
        System.out.println(min);
    }

    void solve(int n, char[] str, int cost) {
        if (cost >= min) {
            return;
        }
        if (n == str.length) {
            if (isSymmetry(str)) {
                min = cost;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            char[] nstr = Arrays.copyOf(str, str.length);
            nstr[n] = iwistr[i];
            solve(n + 1, nstr, cost + (str[n] == nstr[n] ? 0 : 1));
        }
    }

    boolean isSymmetry(char[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            int init = i;
            int tail = str.length - 1 - i;
            if (str[init] == '(' && str[tail] == ')') {
                continue;
            }
            if (str[init] == ')' && str[tail] != '(') {
                continue;
            }
            if (str[init] != str[tail] || str[init] == '(' || str[init] == ')') {
                return false;
            }
        }
        if (str.length % 2 == 1
                && (str[str.length / 2] == '(' || str[str.length / 2] == ')'))
            return false;
        return true;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}