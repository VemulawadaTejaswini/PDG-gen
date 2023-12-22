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
        Arrays.sort(a);
        String out = "YES";
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                out = "NO";
                break;
            }
        }

        // 出力
        System.out.println(out);
    }
}