import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int[]B = new int[A]; 
        
        for (int i = 0 ; i< A; i++){
            
            B[i]  = sc.nextInt();

        }

        sc.close();

        // 答えを初期化
        int ans = 0;
        // 配列に順次アクセス
        for (int i = 0;i<A-1;i++){        
            
            // 右隣への比較回数
            int cnt = 0;
            // jは配列のアクセスしている連番を示す
            for (int j = i;j < A;j++){
                // 最右に移動済みならループから抜ける
                if (j == A-1){
                    break;
                }
                
                //　右隣と比較
                if (B[j] >=B[j+1]){
                    cnt++;
                // 比較終了
                } else{
                    
                    break;

                }


            }
            // 移動回数が最大値を取っているならば答えを更新
            if (ans < cnt){
            
                ans = cnt;
            }
            
            if (ans >= A-i){
                break;
            }
        }
        System.out.println(ans);
    }
       
}       