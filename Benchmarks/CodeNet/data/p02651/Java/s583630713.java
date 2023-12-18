import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 		
        // テストケース数
        int test_times = sc.nextInt();

        // ラウンド回数
        int[] round_times = new int[test_times];
        
        // 設定値
        int[][] set_number = new int[test_times][];

        // ユーザー
        String[] user = new String[test_times];


        // データの取得
        for (int i = 0; i < test_times; i++){
            round_times[i] = sc.nextInt();
            
            set_number[i] = new int[round_times[i]];
            for (int j = 0; j < round_times[i]; j++){
                set_number[i][j] = sc.nextInt();
            }
            
            user[i] = sc.next();
        }
        
        // Xの初期値
        int x = 0;
        
        // 結果
        String[] resultList = new String[test_times];
        
        // テストケース数分の施行
        for (int i = 0; i < test_times; i++){
            x = 0;
            
            // チェック
            for (int j = 0; j < round_times[i]; j++){
               char user_code = user[i].charAt(j);
            
                switch (user_code){
                   case '0':
                        // xが0以外の場合は置き換える
                        if (x != 0){
                            x = x ^ set_number[i][j];
                         }
                        break;
                  case '1':
                        // 人１の場合は置き換える
                        x = x ^ set_number[i][j];
                        break;
                }
             }
             
            if (x == 0){
                resultList[i] = "0";
            } else {
                resultList[i] = "1";
            }
            
        }
        
        for (String result : resultList){
            System.out.println(result);
        }
	}

}