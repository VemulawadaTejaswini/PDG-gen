import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //入力
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[][] a = new int[n][m];
        int[] b = new int[m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        for(int i=0; i<m; i++){
            b[i] = Integer.parseInt(sc.next());
        }
        
        //出力
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += a[i][j] * b[j];
            }
            System.out.println(sum);
        }
    }
}

