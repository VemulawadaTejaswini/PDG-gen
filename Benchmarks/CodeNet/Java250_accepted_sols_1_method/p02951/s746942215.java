
import java.util.*;

public class Main {

    /* チェックリスト
     * SNSに結果を書き込むときはACかWAかのみ(半分だけACとかは書かないこと)
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int n = Integer.parseInt(s.nextLine());
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int c = Integer.parseInt(in[2]);
        int r = a-b;
        if(r >= c){
            System.out.println(0);
        }else {
            System.out.println(c - (a - b));
        }
    }
}