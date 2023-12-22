import java.util.Scanner;

// B - Strings with the Same Length
// https://atcoder.jp/contests/abc148/tasks/abc148_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        char[] S = scanner.next().toCharArray();
        char[] T = scanner.next().toCharArray();
        scanner.close();

        for (int i = 0; i < N; i++) {
            System.out.print(S[i]);
            System.out.print(T[i]);
        }
        System.out.println();
    }
}
