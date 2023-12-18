import java.util.Scanner;

/*
問題文
高八士君は回文が大好きで、回文でない文字列が許せません。高八士君は文字列を
1 回ハグするごとに、文字列から 1 文字を選んで任意の文字に変えることができます。

文字列 S が与えられます。
S を回文にするために必要なハグの最小回数を答えてください。

制約
S は半角英小文字のみから成る文字列
S の長さは 1 以上 100 以下

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String first = s.substring(0, s.length()/2);
        String secound = s.substring(s.length()/2, s.length());

        int count = 0;
        for (int i = 0; i < s.length()/2; i++) {
            String tempF = String.valueOf(first.charAt(i));
            String tempS = String.valueOf(secound.charAt(secound.length()-i-1));
            if (!tempF.equals(tempS)) {
                count++;
            }
        }
        System.out.println(count);
    }
}