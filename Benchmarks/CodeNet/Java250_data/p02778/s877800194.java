import java.util.Scanner;

// B - I miss you...
// https://atcoder.jp/contests/abc154/tasks/abc154_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        int sLength = S.length();

        StringBuilder sb = new StringBuilder(S.length());
        for (int i = 0; i < sLength; i++) {
            sb.append("x");
        }

        System.out.println(sb.toString());
    }
}
