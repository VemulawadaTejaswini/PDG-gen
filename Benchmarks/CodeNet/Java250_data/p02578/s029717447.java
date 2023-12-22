import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int varN = Integer.parseInt(sc.next());
        int lastA = Integer.parseInt(sc.next());
        int presentA = 0;
        long cnt = 0;
        for (int i = 1; i < varN; i++) {
            presentA = Integer.parseInt(sc.next());
            if (presentA < lastA) {
                cnt = cnt + lastA - presentA;
                continue;
            } else {
                lastA = presentA;
            }
        }
        sc.close();

        System.out.println(cnt);
    }
}