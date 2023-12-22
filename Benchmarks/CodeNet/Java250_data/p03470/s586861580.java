import java.util.*;

public class Main {
    public static void main(String... args) {

        /*
        ここは、フィールド
         */

        //Scanner インスタンス生成
        Scanner sc = new Scanner(System.in);
        //標準入力の値を代入する
        //枚数
        int numberMochi = sc.nextInt();
        //各自の直径を格納する配列
        int[] diameterArray = new int[numberMochi];
        //枚数分繰り返す。
        for(int i = 0; i < numberMochi; i++){
            diameterArray[i] = sc.nextInt();
        }
        //重複確認変数
        Set<Integer> duplicationNumber = new HashSet<Integer>();
        /*
        ここからは、アルゴリズム
         */
        //重複分はノーカウント
        //重複しているものが何個あるのか？
        for(int i = 0; i < diameterArray.length; i++){
            duplicationNumber.add(diameterArray[i]);
        }
        //標準出力をする
        System.out.print(duplicationNumber.size());
    }
}