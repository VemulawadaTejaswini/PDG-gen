
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        /*
         * for i j文で全てのパターンを精査するのは追いつかない
         *
         */
        Scanner s = new Scanner(System.in);
        long n = Integer.parseInt(s.nextLine());
        String[] in = new String[(int)n];
        for(int i = 0;i < n;i++){
            String input = s.nextLine();
            char[] c = input.toCharArray();
            Arrays.sort(c);
            in[i] = new String(c);
        }
        Arrays.sort(in);
        long r = 0;
        long c = 1;
        String prev = "";
        for(String now : in){
            if(now.equals(prev)){
                c++;
            }else{
                r += (c * (c-1)) / 2;
                c = 1;
            }
            prev = now;
        }
        r += (c * (c-1)) / 2;
        System.out.println(r);
    }
}