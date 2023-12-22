import java.util.*;
//import java.io.*;
/*
行列 A、ベクトル b はそれぞれ 2 次元配列と１次元配列に記録します。
for ループの入れ子を使って、問題文の公式の通りに ci の値を加算していきます。
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();//　n行ある
       int m = sc.nextInt();//　m行ある

//      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [][] matrix = new int[n][m];//matrix入れる箱
        int [] vector = new int [m];//vector入れる箱

        int x;
        int y;
        int a =0;
        int b =0;

        int i;
        int j;
        int k;
        int num = 0;

        for( i = 0; i < n; i++){
          for( j = 0; j < m; j++){
              x = sc.nextInt();
              matrix[i][j]=x;
 //             System.out.print(x);
          }
        }
          
        for( k = 0; k < m; k++){
            y = sc.nextInt();
            vector[k] = y;
 //           System.out.print(y);
        }
 //       System.out.println();

        int [] answer =new int[n];

         for( i =0; i < n; i++){
             
              for( j = 0; j < m; j++){        
                  
                     a = matrix[i][j];
 //                   System.out.println("a" + a);

                           b = vector[j];
  //                         System.out.println("b" + b);  
                           
                            num = (a*b);
 //                           System.out.println("num" + num);
                            answer[i] = answer[i] + num;
                      }
                      System.out.println(answer[i]);

         }
                      
         
    }
}


