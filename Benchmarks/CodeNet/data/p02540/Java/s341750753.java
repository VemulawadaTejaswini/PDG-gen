import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] X = new int[N];
      int[] Y = new int[N];
      int[] result = new int[N];
      for(int i = 0; i < N; i++){
        X[i] = sc.nextInt();
        Y[i] = sc.nextInt();
        result[i] = 1;
      }
      
      // 判定
      for(int i = 0; i < N-1; i++){
        for(int j = i+1; j < N; j++){
          //System.out.println(X[i] + " " +Y[i] +  " " + X[j] +  " " + Y[j]);
          if((X[i] < X[j] && Y[i] < Y[j]) || (X[i] > X[j] && Y[i] > Y[j])){
            result[i]++;
            result[j]++;
          }
        }
      }
      
      // 出力
      for(int i = 0; i < N; i++){
        System.out.println(result[i]);
      }
    }
    

}