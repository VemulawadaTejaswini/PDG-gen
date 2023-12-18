import java.util.Scanner;

// A - Security
// https://atcoder.jp/contests/abc131/tasks/abc131_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        scanner.close();

        char oldC = S[0];

        for (int i = 1; i< S.length; i++) {
            if (oldC == S[i]) {
                System.out.println("Bad");
                return;
            }
            oldC = S[i];
        }

        System.out.println("Good");
    }
}
