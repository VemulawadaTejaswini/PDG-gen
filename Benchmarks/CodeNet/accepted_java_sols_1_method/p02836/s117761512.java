import java.util.Scanner;

// B - Palindrome-philia
// https://atcoder.jp/contests/abc147/tasks/abc147_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        scanner.close();

        int diffCount = 0;
        for (int i = 0; i < S.length / 2; i++) {
            char left = S[i];
            char right = S[S.length - 1 - i];
            if (left != right) {
                diffCount++;
            }
        }
        System.out.println(diffCount);
    }
}
