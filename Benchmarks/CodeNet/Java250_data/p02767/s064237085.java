import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 変数
        int n = 0; // 参加者
        int x[] = null; // 座標リスト
        int p = 0;
        int energy = 0; // 消費体力

        // 入力値
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];

        // 座標リスト格納
        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            p += x[i];
        }

        // 集会開催場所算出
        p = (int) Math.round((double)p/n);

        // 体力算出
        for (int i=0; i<n; i++) {
            energy += (x[i]-p) * (x[i]-p);
        }

        // 出力
        System.out.println(energy);
    }
}
