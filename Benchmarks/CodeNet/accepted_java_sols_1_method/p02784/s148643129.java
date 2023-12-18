import java.util.Scanner;

// B - Common Raccoon vs Monster
// https://atcoder.jp/contests/abc153/tasks/abc153_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.next());
        int N = Integer.parseInt(scanner.next());
        int attackDamageSum = 0;
        for (int i = 0; i < N; i++) {
            attackDamageSum += Integer.parseInt(scanner.next());
        }
        scanner.close();

        System.out.println(H <= attackDamageSum ? "Yes" : "No");
    }
}
