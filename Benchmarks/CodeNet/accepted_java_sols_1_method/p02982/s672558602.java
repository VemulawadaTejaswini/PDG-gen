import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int d = sc.nextInt();
        int[][] p = new int[n][d];
        int count = 0;
        // for文
        for(int i = 0; i < n; i++){
            for(int j = 0; j < d; j++){
                p[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int dis = 0;
                for(int k = 0; k < d; k++){
                    dis += Math.abs(p[i][k] - p[j][k]) * Math.abs(p[i][k] - p[j][k]);
                }
                if(Math.sqrt(dis) == Math.round(Math.sqrt(dis))) count++;
            }
        }

        // 出力
        System.out.println(count);

    }

}
