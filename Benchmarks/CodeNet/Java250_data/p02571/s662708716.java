import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final String[] varS = sc.next().split("", 0);
        final String[] varT = sc.next().split("", 0);
        sc.close();
        int varSlen = varS.length;
        int varTlen = varT.length;
        int result = 0;
        int cnt = 0;
        //  変換文字列分比較をする
        for (int j = 0; j <= (varSlen - varTlen); j++) {
            cnt = 0;
            for (int i = 0; i < varTlen; i++) {
                if (varT[i].equals(varS[i + j])) {
                    cnt++;
                }
            }
            if (result < cnt) {
                result = cnt;
            }
        }
        result = varTlen - result;
        System.out.println(result);
    }
}