import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 処理
        String out = "APPROVED";
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                if (!(a[i] % 3 == 0 || a[i] % 5 == 0)) {
                    out = "DENIED";
                    break;
                }
            }
        }

        // 出力
        System.out.println(out);
    }

}