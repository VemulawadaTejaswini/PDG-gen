import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        //配列の宣言
        int[] h = new int[n];

        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }

        int l = 0, j, min, answer = 0;
        while(l < n){
            while(l < n && h[l] == 0){
                l++;
            }
            if(l == n) break;
            j = l;
            min = h[l];
            while(j < n && h[j] != 0){
                min = Math.min(h[j], min);
                j++;
            }
            for(int k = 0; k < j; k++){
                h[k] -= min;
            }
            answer += min;
        }

        // 出力
        System.out.println(answer);

    }

}