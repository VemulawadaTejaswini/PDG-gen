import java.util.Scanner;

// B - Papers, Please
// https://atcoder.jp/contests/abc155/tasks/abc155_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(scanner.next());
            if (num % 2 == 0) {
                if (!(num % 3 == 0 || num % 5 == 0)) {
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        scanner.close();

        System.out.println("APPROVED");
    }
}
