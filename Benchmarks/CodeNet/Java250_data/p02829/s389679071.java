import java.util.Scanner;

// A - Round One
// https://atcoder.jp/contests/abc148/tasks/abc148_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        scanner.close();

        if (A == 1 && B == 2) {
            System.out.println("3");
        } else if (A == 1 && B == 3) {
            System.out.println("2");
        } else if (A == 2 && B == 1) {
            System.out.println("3");
        } else if (A == 2 && B == 3) {
            System.out.println("1");
        } else if (A == 3 && B == 1) {
            System.out.println("2");
        } else if (A == 3 && B == 2) {
            System.out.println("1");
        }
    }
}
