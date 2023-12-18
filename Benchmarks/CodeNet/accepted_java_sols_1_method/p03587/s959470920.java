import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        String[] arr = s.split("");
        int result = 0;
        for (String str : arr) {
            result += Integer.parseInt(str);
        }

        // 出力
        System.out.println(result);
    }
}
