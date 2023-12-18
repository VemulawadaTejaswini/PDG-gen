import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] A = new int[N];
       int max = 0; //繰り返すことができる最大回数
      // int tmp = 0;    //操作するAの値を格納する変数
       
       for(int i = 0; i < N; ++i) {
           A[i] = sc.nextInt();
           
           //操作可能な回数分繰り返す
          // tmp = A[i];
           while(A[i] % 2 == 0) {
               A[i] = A[i] / 2;
               ++max;
           }
       }
       
       //出力
       System.out.println(max);
    }
}
