import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long D = sc.nextLong();
      long[] X = new long[N];
      long[] Y = new long[N];
      for(int i = 0; i < N; i++){
        X[i] = sc.nextLong();
        Y[i] = sc.nextLong();
      }
      
      // 判定
      int count = 0;
      D = D*D;
      for(int i = 0; i < N; i++){
        long dist = X[i]*X[i] + Y[i]*Y[i];
        if(dist <= D){
          count++;
        }
      }
      
      
      // 出力
      System.out.println(count);
    }

}