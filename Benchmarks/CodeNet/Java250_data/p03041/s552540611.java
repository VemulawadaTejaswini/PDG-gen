import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer k = Integer.parseInt(sc.next());
        String s = sc.next();

        // 主処理
        String result = "";
        for (int i = 0; i < n; i++) {
            result += (i == k - 1) ? String.valueOf(s.charAt(i)).toLowerCase() : s.charAt(i);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}