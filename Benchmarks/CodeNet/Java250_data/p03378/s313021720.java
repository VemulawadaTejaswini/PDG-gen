import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // マス目の数
        int m = Integer.parseInt(sc.next()); // 料金所の数
        int x = Integer.parseInt(sc.next()); // 初期地点
        // 料金所マス
        HashSet<Integer> a = new HashSet<>(m);
        for (int i = 0; i < m; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        // 全てのマス
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n + 1; i++) {
            // 料金所マスは1、それ以外は0とする
            if (a.contains(i)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        // 初期地点から左右の料金所マスの数を計算
        String left = Main.deleteZero(sb.substring(0, x));
        String right = Main.deleteZero(sb.substring(x + 1));
        int answer = Math.min(left.length(), right.length());
        out.println(answer);
        out.close();
        sc.close();
    }

    /**
     * 引数の文字列から"0"を削除した値を返却
     * @param pstr
     * @return
     */
    private static String deleteZero(String pstr) {
        String str = pstr.replaceAll("0", "_");
        return str.replaceAll("_", "");
    }
}
