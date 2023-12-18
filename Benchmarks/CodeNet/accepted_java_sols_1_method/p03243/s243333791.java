import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 標準入力を受け取る
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while (true){
            // Nの桁数
            int l = String.valueOf(N).length();
            // Nの一の位の数
            int x = N % 10;
            // 全ての桁の数が同じであるフラグ
            boolean correct_flg = true;
            // Nの十の位以降の数を取得し、xと比較する
            for (int i = 2; i <= l; i++) {
                // Nのある桁の数
                int y = (N % (int) Math.pow(10, i)) / (int) Math.pow(10, i-1);
                // xと等しくない => 全ての桁の数が等しい数ではない
                if (x != y) {
                    correct_flg = false;
                    break; // これ以降の桁の数を調べる必要がない
                }
            }
            // correct_flgがtrue => 全ての桁の数が等しい
            if (correct_flg) {
                break; // ループを抜ける
            }
            // correct_flgがfalse => Nに1を足して次のループへ
            else {
                N++;
            }
        }
        
        // 全ての桁の数が等しくなったNを標準出力
        System.out.println(N);

    }

}