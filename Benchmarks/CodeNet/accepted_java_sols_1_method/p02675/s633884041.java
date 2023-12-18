import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        //int n = sc.nextInt();
        String n = sc.next();

        // 処理
        char m = n.charAt(n.length()-1);
        String out = "";
        switch(m) {
        case '2':
        case '4':
        case '5':
        case '7':
        case '9':
            out = "hon";
            break;
        case '3':
            out = "bon";
            break;
        default:
            out = "pon";
        }

        // 出力
        System.out.println(out);
    }
}
