
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[1]);
        if(b == 1){
            System.out.println(0);
            return;
        }
        for(int i = 1;i < Integer.MAX_VALUE;i++){
            int r = (a - 1) * (i - 1) + a;
            if(r >= b){
                System.out.println(i);
                break;
            }
        }
    }
}