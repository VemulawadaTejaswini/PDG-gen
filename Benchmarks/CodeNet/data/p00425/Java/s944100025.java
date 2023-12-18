
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        

        // ----- 変数 ----- //
        String str;
        boolean flag = false; // デバッグ用。提出時はfalse。
        boolean first = true;
        int n = 0;
        int total = 0;
        int[] dice = new int[6];
        
        try {
            while(flag || reader.ready()){

                // ----- データ処理 ----- //
                // 文字列の取得
                str = reader.readLine();

                // 初回のみ別処理
                if(first) {
                    first = false;
                    // 移動回数取得
                    n = Integer.parseInt(str);
                    // 合計値の初期化
                    total = 1;
                    // サイコロ初期配置
                    dice = new int[] {1, 6, 5, 3, 2, 4};

                    if (n == 0) {break;}
                    else {continue;}
                } 

                // サイコロの移動処理
                switch(str) {
                    case "North" : North(dice); break;
                    case "South" : North(dice); North(dice); North(dice); break;
                    case "East"  : East(dice); break;
                    case "West"  : East(dice); East(dice); East(dice); break;
                    case "Right" : Right(dice); break;
                    case "Left"  : Right(dice); Right(dice); Right(dice); break;
                }

                total += dice[0];

                
                if(--n == 0) {
                    System.out.println(total);
                    first = true;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数 ----- //

    //上  下  北  東  南  西
    //---------------------
    //０  １　２　３   ４　５
    //０  ５  ４  ２  １  ３
    // dice = new int[] {1, 6, 5, 3, 2, 4};

    private static void North(int[] dice){
        int temp = dice[0];
        dice[0] = dice[4];
        dice[4] = dice[1];
        dice[1] = dice[2];
        dice[2] = temp;
    }

    private static void East(int[] dice){
        int temp = dice[0];
        dice[0] = dice[5];
        dice[5] = dice[1];
        dice[1] = dice[3];
        dice[3] = temp;
    }

    private static void Right(int[] dice){
        int temp = dice[2];
        dice[2] = dice[5];
        dice[5] = dice[4];
        dice[4] = dice[3];
        dice[3] = temp;
    }
}
