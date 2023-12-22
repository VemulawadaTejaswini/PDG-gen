import java.util.Scanner;

/**
 * TITLE : Poor
 * URL : https://atcoder.jp/contests/abc155/tasks/abc155_a
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A == B && B == C) || (A != B && A != C && B != C)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        sc.close();
    }
}