import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] s = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        String[] number = new String[n];
        for (int i = 0; i < m; i++) {
            if (number[s[i] - 1] != null && !Integer.toString(c[i]).equals(number[s[i] - 1])) {
                number[s[i] - 1] = "x";
            } else {
                number[s[i] - 1] = Integer.toString(c[i]);
            }
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] == null) {
                number[i] = (1 < number.length && i == 0) ? "1" : "0";
            }
        }

        String result = String.join("", number);
        if (0 <= result.indexOf("x") || (1 < result.length() && result.charAt(0) == '0')) {
            result = "-1";
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}