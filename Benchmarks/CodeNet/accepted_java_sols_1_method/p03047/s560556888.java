import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int k = sc.nextInt();

        // 出力
        System.out.println(n-k+1);

    }

}
