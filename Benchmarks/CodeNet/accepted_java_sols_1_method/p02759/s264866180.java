import java.util.Scanner;

/**
 * TITLE : Duplex Printing
 * URL : https://atcoder.jp/contests/abc157/tasks/abc157_a
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N / 2 + N % 2);
        sc.close();
    }
}
