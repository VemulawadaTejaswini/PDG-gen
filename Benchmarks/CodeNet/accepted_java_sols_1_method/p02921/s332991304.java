
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int r = 0;
        int n = 0;
        for(char c : s1.toCharArray()){
            if(c == s2.charAt(n)){
                r++;
            }
            n++;
        }
        System.out.println(r);
    }
}