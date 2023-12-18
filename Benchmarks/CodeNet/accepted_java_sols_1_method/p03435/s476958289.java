import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値の取得
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                c[i][j] = sc.nextInt();
            }
        }
        
        a[0] = 0;   //仮定
        
        for (int i = 0; i < 3; ++i){    //各列
           b[i] = c[0][i] - a[0];
        }
        for (int i = 0; i < 3; ++i){    //各行
           a[i] = c[i][0] - b[0];
        }
        
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                if (c[i][j] != a[i] + b[j]){  //一つでも異なるものがあれば、正しいとは言えない
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        
        System.out.println("Yes");
        
    }
}