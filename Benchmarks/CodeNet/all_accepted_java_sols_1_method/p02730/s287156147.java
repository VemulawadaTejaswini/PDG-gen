import java.util.Scanner;

/**
 * TITLE : String Palindrome
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_b
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String a = S.substring(0, S.length() / 2);
        String b = S.substring(S.length() / 2 + 1, S.length());
        StringBuffer str = new StringBuffer(b);
        System.out.println(str.toString().equals(a) ? "Yes" : "No");
    }
}
