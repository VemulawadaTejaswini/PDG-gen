import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] tStringArr = new String[]{
                "dream",
                "dreamer",
                "erase",
                "eraser",
        };

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String sReverse = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < tStringArr.length; i++) {
            tStringArr[i] = new StringBuilder(tStringArr[i]).reverse().toString();
        }

        boolean ans = true;
        for (int i = 0; i < sReverse.length();) {

            boolean flg = false;// 文字列が部分一致するか

            for (int j = 0; j < tStringArr.length; j++) {
                String tmpSubString = "";
                if (i + tStringArr[j].length() > sReverse.length()) {
                    tmpSubString = sReverse.substring(i);
                } else {
                    tmpSubString = sReverse.substring(i, i + tStringArr[j].length());
                }

                if (tmpSubString.equals(tStringArr[j])) {
                    // 一致したので次の文字列比較へ進む
                    i += tmpSubString.length();
                    flg = true;
                    break;
                }
            }

            if (!flg) {
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "YES" : "NO");
    }
}
