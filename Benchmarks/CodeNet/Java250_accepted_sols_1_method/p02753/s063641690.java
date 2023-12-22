import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        // 変数宣言
        final String ALL_A = "AAA";
        final String ALL_B = "BBB";
        final String YES_STR = "Yes";
        final String NO_STR = "No";
        String S;
        String judge;

        // スキャナークラスのインスタンスを作成
        Scanner sc = new Scanner(System.in);

        // 入力受付
        S = sc.nextLine();
        sc.close();

        // 比較
        if( S.equals(ALL_A) || S.equals(ALL_B)){
            judge = NO_STR;
        }else{
            judge = YES_STR;
        }

        // 出力
        // バスが運行することになる駅の組み合わせが存在する場合は Yes を、存在しない場合は No 
        System.out.println( judge );
        
    }
}