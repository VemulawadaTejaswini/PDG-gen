
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        String[] sa = s.nextLine().split(" ");
        List<Float> list = new ArrayList<Float>();
        for(String in : sa){
            list.add(Float.valueOf(in));
        }
        float gyaku = 0;
        for(float i : list){
            gyaku += 1 / i;
        }
        System.out.println(1 / gyaku);
    }
}