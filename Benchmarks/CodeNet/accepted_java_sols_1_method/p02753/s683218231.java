import java.util.Scanner;

/**
 * TITLE : Station and Bus
 * URL : https://atcoder.jp/contests/abc158/tasks/abc158_a
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if ("AAA".equals(S) || "BBB".equals(S)) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        sc.close();
    }
}
