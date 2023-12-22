import java.util.*;

// 日本でよく使われる紙幣は、
// 10000円札、
// 5000円札、
// 1000円札です。以下、「お札」とはこれらのみを指します。

// 青橋くんが言うには、彼が祖父から受け取ったお年玉袋にはお札が N枚入っていて、合計で Y円だったそうですが、嘘かもしれません。このような状況がありうるか判定し、
// ありうる場合はお年玉袋の中身の候補を一つ見つけてください。なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。

public class Main{
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        // お札の枚数
        int N = sc.nextInt();
        
        // 合計金額
        int Y = sc.nextInt();

        sc.close();

        // 枚数のパターンを洗い出す → 合計金額を算出する → 合計金額が一致するならばそのパターンを出力　パターンを洗い出してなければ-1を出力
        // 10000円札
        boolean breakFlg = false;
        for (int i = 0; i<=N; i++){
            
        	// 5000円札
            for (int j = 0 ; j <= N-i; j++){
             
            	// 1000円札
             int k = N - (i + j);

             int trueMoney = (i * 10000) + (j * 5000) + (k * 1000);

             if (Y == trueMoney ){
                System.out.println(i+"\t"+j+"\t"+k);

                breakFlg = true;

                break;
             }   
                
            }
            
            if (breakFlg){
            
            	break;
            }
            
        }

        if (!breakFlg){
        	System.out.println(-1+"\t"+-1+"\t"+-1);
        }

        
    }
}