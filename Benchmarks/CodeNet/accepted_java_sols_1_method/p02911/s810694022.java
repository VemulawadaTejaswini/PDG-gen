
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        Long k = Long.parseLong(in[1]);
        int q = Integer.parseInt(in[2]);
        List<Long> players = new ArrayList<Long>();
        for(int i = 0;i < n;i++){
            players.add(k - q);
        }
        for(int i = 0;i < q;i++){
            int player = Integer.parseInt(sc.next()) - 1;
            long ok = players.get(player) + 1;
            players.set(player,ok);
        }
        for(int i = 0;i < players.size();i++){
            System.out.println(players.get(i) <= 0 ? "No" : "Yes");
        }
    }
}