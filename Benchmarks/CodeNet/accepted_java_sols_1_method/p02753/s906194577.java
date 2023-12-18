import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();

        // 処理
        String out = "Yes";
        if(s.equals("AAA") || s.equals("BBB")){
            out = "No";
        }

        // 出力
        System.out.println(out);
    }

}