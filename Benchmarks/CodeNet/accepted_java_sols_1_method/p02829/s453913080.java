import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();

        int out = 6 - (a + b);

        // 出力
        System.out.println(out);
    }
}