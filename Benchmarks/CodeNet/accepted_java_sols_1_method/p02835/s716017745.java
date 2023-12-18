import java.util.Scanner;

// A - Blackjack
// https://atcoder.jp/contests/abc147/tasks/abc147_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A1 = Integer.parseInt(scanner.next());
        int A2 = Integer.parseInt(scanner.next());
        int A3 = Integer.parseInt(scanner.next());
        scanner.close();

        if (A1 + A2 + A3 >= 22 ) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}
