import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        // 文字列の入力
        int c = sc.nextInt();
        int ans;
        if(b / a > c){
            ans = c;
        }else{
            ans = b / a;
        }
        // 出力
        System.out.println(ans);

    }

}