import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int s = sc.nextInt();
        int w = sc.nextInt();
        //String s = sc.next();

        // 処理
        String out = "safe";
        if (w >= s) {
            out = "unsafe";
        }

        // 出力
        System.out.println(out);
    }
}