import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[][] a = new int[2][n];
                int[] yono = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[0][i] = i + 1;
                        a[1][i] = sc.nextInt() - 1;
                }
                for(int i = 0 ; i < n ; i++){
                        yono[a[1][i]] = a[0][i];
                }
                for(int i = 0 ; i < n ; i++){
                        System.out.print(yono[i]);
                        if(i != n - 1){
                                System.out.print(" ");
                        }else{
                                System.out.println();
                        }
                }
        }
}
//早く正確なコードを書けるように頑張ります