import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String S = scanner.next();

        String Asub = S.substring(0, A);
        String Bsub = S.substring(A+1, A+B+1);

        /*
        System.out.println("Asub：" + Asub);
        System.out.println(isNum(Asub));
        System.out.println("Bsub：" + Bsub);
        System.out.println(isNum(Bsub));
        */

        String result = "No";
        //文字列が数字かつ、文字列のA+1番目がハイフン
        if (isNum(Asub) && isNum(Bsub) && S.substring(A, A+1).equals("-")) {
            result = "Yes";
        }
        System.out.println(result);
    }

    //文字列が数字か判定
    public static boolean isNum(String s) {
        return Pattern.compile("^-?[0-9]+$").matcher(s).find();
    }

}