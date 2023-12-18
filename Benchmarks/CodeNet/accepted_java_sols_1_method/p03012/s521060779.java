import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        int[] num = new int[n];
        int ans = Integer.MAX_VALUE;

        for(int i = 0;i < n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0;i < n; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j < i; j++){
                sum1 += num[j];
            }
            for(int j = i; j < n; j++){
                sum2 += num[j];
            }
            ans = Math.min(ans, Math.abs(sum1 - sum2));
        }

        // 出力
        System.out.println(ans);

    }

}