import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();   //行数
        int c = sc.nextInt();   //列数
        int[][] a = new int[r][c];  //r行c列の行列
        int[] sum_r = new int[r];   //行合計
        int[] sum_c = new int[c];   //列合計
        int sum_all = 0;    //合計

        /* 値取得 */
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                a[i][j] = sc.nextInt();
                sum_r[i] += a[i][j];
                sum_c[j] += a[i][j];
                sum_all += a[i][j];
            }

        }

        for(int i = 0;i < r + 1;i++){
            if(i < r){
                for(int j = 0;j < c + 1;j++){
                    if(j != 0)  System.out.print(" ");
                    if(j < c)   System.out.print(a[i][j]);
                    if(j == c)  System.out.print(sum_r[i]);    
                }
                System.out.println();
            }
            if(i == r){
                for(int j = 0;j < c + 1;j++){
                    if(j != 0)  System.out.print(" ");
                    if(j < c)   System.out.print(sum_c[j]);
                    if(j == c)  System.out.print(sum_all);
                }
                System.out.println();
            }
        }
    }
}
