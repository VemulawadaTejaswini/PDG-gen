import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        long[][] a = new long[n][m];  //行列A定義
        long[][] b = new long[m][l];  //行列B定義
        long[][] c = new long[n][l];  //行列C定義

        /* Aの値代入 */
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        /* Bの値代入 */
        for(int i = 0;i < m;i++){
            for(int j = 0;j < l;j++){
                b[i][j] = sc.nextInt();
            }
        }

        /* 演算処理　*/
        for(int i = 0;i < n;i++){
            for(int j = 0;j < l;j++){
                for(int k = 0;k < m;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        /* 表示処理 */
        for(int i = 0;i < n;i++){
            for(int j = 0;j < l;j++){
                if(j != 0)  System.out.print(" ");
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
