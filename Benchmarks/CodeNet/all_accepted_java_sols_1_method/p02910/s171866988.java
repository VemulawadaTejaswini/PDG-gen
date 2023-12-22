import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //タップダンスの動きを取得する
        String allStep = sc.next();
        //1文字ずつに分解する
        String[] stepArray = allStep.split("");
        
        
        //踏みやすいステップかどうかのフラグを設定する
        boolean easyStepFlg = true;
        
        //結果出力用の文字列を定義する
        String result = "";
        
        //踏みやすいかどうかを判定する
        for(int i = 0; i < stepArray.length; i++) {

          	//奇数偶数で分岐する文字判定ロジック
            if(i % 2 == 0) {
            // 奇数文字目：L以外なら踏みやすい
            // リストとしては0番目から始まるため、iが偶数の場合となる
                if(stepArray[i].equals("L")) {
                    easyStepFlg = false;
                }
            } else if (i % 2 == 1) {
            // 偶数文字目：R以外なら踏みやすい（iが奇数の場合を判定する）
                if(stepArray[i].equals("R")) {
                    easyStepFlg = false;
                }
            } else {
                //普通はここに入らないが念の為falseにしておく
                easyStepFlg = false;
            }
            
            //L,R,U,Dのいずれでもない場合は踏みにくいためfalseとする
            if(!(stepArray[i].equals("L") || stepArray[i].equals("R") || stepArray[i].equals("U") || stepArray[i].equals("D"))) {
                easyStepFlg = false;
            }
            
            //踏みやすいかどうかフラグがfalseになったらfor文を抜けて処理を終わらせる
            if(!easyStepFlg) {
                break;                
            }
        }
        
        //for文を最後まで回して踏みやすいフラグがtrueのままならYes、ダメな場合はNoを結果に詰める
        if(easyStepFlg) {
            result = "Yes";
        } else {
            result = "No";
        }

        //判定の結果を出力する
        System.out.println(result);
    }    
}