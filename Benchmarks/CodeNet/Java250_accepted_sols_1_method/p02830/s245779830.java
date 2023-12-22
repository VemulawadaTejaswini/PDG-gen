import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 長さＮ
        int n = sc.nextInt();

        // 文字列Ｓ、Ｔ
        String s = sc.next();
        String t = sc.next();

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < n; index++) {
            result.append(s.charAt(index));
            result.append(t.charAt(index));
        }

        // 出力
        System.out.println(result);
    }
}