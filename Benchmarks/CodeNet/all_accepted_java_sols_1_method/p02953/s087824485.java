
import java.util.*;

public class Main {

    /* チェックリスト
     * SNSに結果を書き込むときはACかWAかのみ(半分だけACとかは書かないこと)
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String[] args) {
        /*
         * 前のマスが現在のマスと等しいか現在のマスより小さい場合 => YES
         * 前のマスは可能であれば小さくする
         * -1した時に前の値と等しいか、それ以上であることを確認
         */
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] ss = s.nextLine().split(" ");
        int prev = 0;
        boolean r = true;
        for(int i = 0;i < n;i++) {
            int current = Integer.parseInt(ss[i]);
            if(prev <= current -1){
                prev = current - 1;
                continue;
            }
            if(prev <= current){
                prev = current;
                continue;
            }else{
                r = false;
                break;
            }
        }
        System.out.println(r ? "Yes":"No");
    }
}