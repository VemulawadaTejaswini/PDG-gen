import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int[] abhm = readIntegers(br);
        int a = abhm[0];
        int b = abhm[1];
        int h = abhm[2];
        int m = abhm[3];

        // 0時と12時0分だけは0
        // 1時間ごとに30度
        double tan = (h * 30) + (0.5 * m); // 短針が0時から何度の位置にあるか
        double tyou = m * 6; // 長針も同様

        double kakudo = tyou - tan; // 長針と短針の位置の差が角度となる
//        kakudo = Math.abs(kakudo); // わかりやすく
//        if (kakudo == 0d || kakudo == 360d) { // 長針と短針が重なっている場合
//            System.out.println(0); //距離は0
//            return;
//        }
//        if (kakudo == 180d) { // 180度真逆の場合は長針と短針の長さになるだろう
//            System.out.println(a + b);
//            return;
//        }

        double rad = Math.toRadians(kakudo);
        // 余弦定理
        double a_sq = (a * a) + (b * b) - (2 * a * b * Math.cos(rad));
        System.out.println(Math.sqrt(a_sq));
    }

    private static int readInteger(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static int[] readIntegers(BufferedReader br) throws IOException {
        String[] s = br.readLine().split(" ");
        int[] ret = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ret[i] = Integer.parseInt(s[i]);
        }
        return ret;
    }

}
