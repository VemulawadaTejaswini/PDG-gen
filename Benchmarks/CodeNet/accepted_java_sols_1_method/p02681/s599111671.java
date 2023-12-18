import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //文字列の入力受付
        Scanner inStr = new Scanner(System.in);
        String S = inStr.nextLine();
        String T = inStr.nextLine();
        inStr.close();

        /*
         * 以下の条件を満たすこと
         *・S,Tは英小文字、文字数は1~10文字
         *・|T| = |S| + 1
         */
        if (Pattern.matches("[a-z]{1,10}", S) && Pattern.matches("[a-z]+", T)
                && T.length() == S.length() + 1) {
            //Tの文字列がSの文字列を全て含んでいること
            String subStr = T.substring(0, S.length());

            //判定結果を出力
            if (S.equals(subStr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } else {
            System.out.println("No");
        }

    }

}
