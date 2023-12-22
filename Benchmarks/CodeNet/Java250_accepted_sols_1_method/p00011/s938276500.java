import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // あみだくじ貰ったリストに応じてスワップする。
        int w, n, a, b, i;// w(整数),n(整数),a,bはスワップの横棒(i番目)
        int fdata[] = new int[30];
        w = sc.nextInt();
        n = sc.nextInt();
        // 初期データ確保
        for (i = 0; i < w; i++) {
            fdata[i] = i + 1;
        }
        for (i = 0; i < n; i++) {
            // 来るa1,b1に対する処理
            int swap, index;
            String string = sc.next();
            index = string.indexOf(",");
            a = Integer.parseInt(string.substring(0, index)) - 1;// substring(a,b)b-aまでを返す
            b = Integer.parseInt(string.substring(index + 1)) - 1;// substring(a)aまで以外を返す

            swap = fdata[a];
            fdata[a] = fdata[b];
            fdata[b] = swap;
        }
        for (i = 0; i < w; i++) {
            System.out.println(fdata[i]);
        }
    }
}
