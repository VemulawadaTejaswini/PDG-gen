import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        // 主処理
        String strN = Long.toString(n);

        int sum = 0;
        for (int i = 0; i < strN.length(); i++) {
            sum += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }

        int head = Integer.parseInt(String.valueOf(strN.charAt(0))) - 1;
        int lowerSum = (strN.length() - 1) * 9 + head;

        int result = Math.max(sum, lowerSum);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
