import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] A = new int[N];
       for(int i = 0; i < N; ++i) {
           A[i] = sc.nextInt();
       }
       
       //うさぎのペアを探す
       int count = 0;   ///ペア数のカウント
       for(int i = 0; i < N; ++i) {
           //うさぎは1から数えるため1を加える
           if(i + 1 == A[A[i]-1]) {
               ++count;
           }
       }
       
       count = count / 2;
       //出力
       System.out.println(count);
    }
}
