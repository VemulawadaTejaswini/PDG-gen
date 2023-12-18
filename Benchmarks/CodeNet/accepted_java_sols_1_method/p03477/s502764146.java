import java.util.Scanner;

// A - Libra
// https://atcoder.jp/contests/abc083/tasks/abc083_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        int D = Integer.parseInt(scanner.next());
        scanner.close();

        if (A + B == C + D) {
            System.out.println("Balanced");

        } else if (A + B > C + D) {
            System.out.println("Left");
        } else {
            System.out.println("Right");
        }
    }
}
