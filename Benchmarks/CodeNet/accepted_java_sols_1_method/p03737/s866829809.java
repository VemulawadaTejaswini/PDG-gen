import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        // 主処理
        String result = String.valueOf(s1.charAt(0)).toUpperCase() + String.valueOf(s2.charAt(0)).toUpperCase()
                + String.valueOf(s3.charAt(0)).toUpperCase();

        // 出力
        System.out.println(result);
        sc.close();
    }
}
