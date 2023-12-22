import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int x = sc.nextInt();

        // 処理
        int out = 0;

        out += (x / 500) * 1000;
        out += ((x % 500) / 5) * 5;

        // 出力
        System.out.println(out);
    }
}