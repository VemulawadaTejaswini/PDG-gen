import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] l = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int left = Arrays.stream(l).max().getAsInt();
        int right = Arrays.stream(r).min().getAsInt();

        int result = Math.max(0, right - left + 1);

        // 出力
        System.out.println(result);
        sc.close();
    }
}