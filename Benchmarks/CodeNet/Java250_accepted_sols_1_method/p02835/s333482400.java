import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String out = (a + b + c) >= 22 ? "bust" : "win";

        // 出力
        System.out.println(out);
    }
}