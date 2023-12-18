import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
      }
      
      // 取引
      long money = 1000L;
      long kabu = 0L;
      for(int i = 0; i < N; i++){
        if(kabu > 0){
          money = money + kabu * A[i];
          kabu = 0;
        }
        if(i < N-1 && A[i] < A[i+1]){
          kabu = money / A[i];
          money = money % A[i];
        }
      }
      
      // 出力
      System.out.println(money);
    }
    

}