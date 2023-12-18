import java.util.*;
/*行列の積
１行目に ｎｍｌ が空白区切りで与えられます。続く行にｎｘｍの行列Aと
ｍｘｌの行列Bが与えられます。ｎｘｌの行列Cの要素を出力する。
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        int [][] a = new int[n][m];//ｎｘｍを入れる箱
        int [][] b = new int[m][l];//ｍｘｌを入れる箱
        long [][] c = new long[n][l];//answerのｎｘｌを入れる箱

        int i;//n
        int j;//m
        int k;//l
        
        
//      System.out.println(n+" "+m+" "+l);
//ｎｘｍとｍｘｌの読込
        for( i = 0; i < n; i++){
          for( j = 0; j < m; j++){
              a[i][j] = sc.nextInt();
//              System.out.print(a[i][j]);
          }
//          System.out.println();
        }
        
        for(i = 0;i<m;i++){
            for(j = 0;j<l;j++){
                b[i][j] = sc.nextInt();
//              System.out.print(b[i][j]);
                
            }
//            System.out.println();
        }
        
        //ここから
        for ( i = 0; i < n; i++){
            for ( j = 0; j < l; j++){
                for ( k = 0; k < m; k++){
                      
             //      c[i][j] = a[i][k] * b[k][j];
                   c[i][j] += ( a[i][k]*b[k][j]);
                }
            }
        }
        
        for( i = 0; i < n; i++){
            for( j = 0; j < l; j++){
                if(!(j==l-1)){
                System.out.print(c[i][j] +" ");
                }else if(j == l-1){
                    System.out.println(c[i][j]);
                }
            }
        }
    }
}

