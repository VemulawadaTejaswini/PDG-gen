import java.util.Scanner;

/**
 * Station and Bus
 * 
 * https://atcoder.jp/contests/abc158/tasks/abc158_a
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String S = sc.next();

        if (S.charAt(0) == S.charAt(1) && S.charAt(0) == S.charAt(2)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

}
