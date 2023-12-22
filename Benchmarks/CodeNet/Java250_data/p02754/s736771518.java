import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * TITLE : Count Balls
 * URL : https://atcoder.jp/contests/abc158/tasks/abc158_b
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String A = sc.next();
        String B = sc.next();
        BigDecimal NBC = new BigDecimal(N);
        BigDecimal ABC = new BigDecimal(A);
        BigDecimal BBC = new BigDecimal(B);

        BigDecimal answer = NBC.divide(ABC.add(BBC), 0, RoundingMode.DOWN).multiply(ABC);
        if (ABC.compareTo(NBC.remainder(ABC.add(BBC))) >= 0) {
            answer = answer.add(NBC.remainder(ABC.add(BBC)));
        } else {
            answer = answer.add(ABC);
        }
        System.out.println(answer.toString());
        sc.close();
    }
}