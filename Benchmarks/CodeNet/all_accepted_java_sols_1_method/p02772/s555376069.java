import java.util.Scanner;

/**
 * TITLE : Papers, Please
 * URL : https://atcoder.jp/contests/abc155/tasks/abc155_b
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A % 2 == 0 && (A % 3 != 0 && A % 5 != 0)) {
                System.out.println("DENIED");
                sc.close();
                return;
            }
        }
        System.out.println("APPROVED");
        sc.close();
    }
}