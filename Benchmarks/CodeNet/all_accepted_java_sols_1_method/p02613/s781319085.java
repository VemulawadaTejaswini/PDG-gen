import java.util.*;
public class Main {
        public static void main(String[] args){
                // 初期化
                int ac=0;
                int wa=0;
                int tle=0;
                int re=0;

                Scanner sc = new Scanner(System.in);
                // 整数の入力
                int n = sc.nextInt();
                // ループ
                for (int i=0; i<n; i++) {
                        // 文字列の入力
                        String s = sc.next();
                        if (s.equals("AC")) {ac++;}
                         else if (s.equals("WA")) {wa++;}
                         else if (s.equals("TLE")) {tle++;}
                         else if (s.equals("RE")) {re++;}
                }
                // 出力
                System.out.println("AC x " + ac);
                System.out.println("WA x " + wa);
                System.out.println("TLE x " + tle);
                System.out.println("RE x " + re);

        }
}
