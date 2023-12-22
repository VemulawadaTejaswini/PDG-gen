import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //入力値を取得する
        Scanner sc = new Scanner(System.in);
        
        // 実行回数を取得する
        int execNum = Integer.parseInt(sc.next());
        
        //黒板の数値をリストに格納する
        List<Integer> numList = new ArrayList<Integer>();
        for(int i=0;i<execNum;i++) {
            numList.add(Integer.parseInt(sc.next()));
        }
        
        //操作回数を定義する
        int opeNum = 0;
        
        //偶数フラグを設定する
        boolean evenFlg = true;
        
        //取得した数値を2で割っていく。剰余が1のものが出てきたらfor文を抜ける
        while(evenFlg) {
          
          	//剰余判定・計算処理
            for(int j=0;j < numList.size();j++) {
                //numList.get[j]を定義する
                int jNum = numList.get(j);
                if (jNum % 2 == 0) {
                    //偶数であるため2で割った数を再びリストに格納する
                    numList.set(j,jNum / 2);
                } else {
                    // 奇数が出た、または整数ではなかったため偶数フラグをfalseに変更する
                    evenFlg = false;
                }
            }
        
            //偶数フラグのチェック処理
            if (!evenFlg) {
                //奇数が出た場合は操作回数検証while文を抜ける
                break;
            } else {
                //全て偶数であったため、操作回数を1増やす
                opeNum++;
            }
        }
        
        //操作回数を出力する
        System.out.println(opeNum);
    }
}
