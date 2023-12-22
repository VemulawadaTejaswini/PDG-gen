import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int varD = Integer.parseInt(sc.next());
        final int varT = Integer.parseInt(sc.next());
        final int varS = Integer.parseInt(sc.next());
        sc.close();

        String result = "Yes";
        if (varD > varT * varS) {
            result = "No";
        }
        System.out.println(result);
    }
}