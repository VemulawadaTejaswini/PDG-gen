import java.util.*;

public class Main{
    /**
     * メインメソッド
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        final int answer = weatherReport(S);
        System.out.println(answer);
    }

    /**
     * ロジック
     */
    public static int weatherReport(String S) {
        if (S.matches("R{3}")){
            return 3;
        } else if (S.matches(".*R{2}.*")) {
            return 2;
        } else if (S.matches(".*R.*")) {
            return 1;
        } else {
            return 0;
        }
    }
}