import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //単語w
        String w = sc.next();
        //単語wを小文字変換
        w = w.toLowerCase();
        //検索回数
        int count=0;

        while(true){
            //文字列t
            String t = sc.nextLine();
            //"END_OF_TEXT"という文字列が文章の終わり
            if(t.equals("END_OF_TEXT")) break;
            //文字列tを小文字変換
            t = t.toLowerCase();
            //文字列tを半角スペースで分割して配列に登録
            String[] list = t.split(" ");
            //配列内の要素を順番に取得
            for(String str: list){
                //単語wと等しい場合、検索回数を加算
                if(str.equals(w)) count++;
            }
        }
        //検索回数を出力
        System.out.println(count);
    }

}

