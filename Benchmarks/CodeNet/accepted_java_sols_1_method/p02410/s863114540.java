import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   //行定義
        int m = sc.nextInt();   //列定義

        int[][] A = new int[n][m];  //行列A定義
        int[] b = new int[m];  //行列b定義

        /* 行列Aの値代入 */
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                A[i][j] = sc.nextInt();
            }
        }

        /* 行列bの値代入 */
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }

        /* 演算処理 */
        int sum;    //計算結果
        for(int i = 0;i < n;i++){
            sum = 0;
            for(int j = 0;j < m;j++){
                sum += A[i][j] * b[j];
            }
            System.out.println(sum);
        }
    }
}

