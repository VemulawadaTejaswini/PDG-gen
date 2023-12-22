import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //タップダンスの動き
        String s;
        //標準入力を読み込むためのScanner
        Scanner sc = new Scanner(System.in);
        //動きやすいかどうかの結果
        String result = "Yes";
        
        //タップダンスの動きを標準入力から取得
        s = sc.next();
        //文字列から"L"を探す
        for(int i = 0; i < s.length(); i++){
            //文字列に"L"が含まれている位置を取得
            int index = s.indexOf("L", i);
            
            //"L"が見つかった場合、動きづらいどうかの判定と取得位置の更新をする
                //"L"が奇数文字目にあれば動きづらい
            if(index != -1){
                if((index + 1) % 2 != 0){
                    result = "No";
                }
                //Lが見つかった位置を指定
                i = index;
            }
        }
        
        //文字列から"R"を探す
        for(int i = 0; i < s.length(); i++){
            //文字列に"R"が含まれている位置を取得
            int index = s.indexOf("R", i);
            
            //"R"が見つかった場合、動きづらいどうかの判定と取得位置の更新をする
                //"R"が偶数文字目にあれば動きづらい
            if(index != -1){    
                if((index + 1) % 2 == 0){
                    result = "No";
                }
                //Rが見つかった位置を指定
                i = index;
            }
        }
        
        //結果を出力
        System.out.println(result);

    }
}
