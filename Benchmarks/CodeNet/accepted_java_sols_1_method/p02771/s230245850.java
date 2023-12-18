import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 変数宣言
        String result = "No";

        // 入力処理
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 演算処理
        if( a == b || a == c || b == c ){
            if( !( a==b && b==c ) ){
                result = "Yes";
            }
        }
        
        // 出力
        System.out.println( result );
    }
}