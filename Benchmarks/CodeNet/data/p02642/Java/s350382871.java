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
      Arrays.sort(A);
      
      boolean[] list = new boolean[N];
      Arrays.fill(list, true);
      
      // 判定
      int count = 0;
      for(int i = 0; i < N; i++){
        if(list[i]){
          for(int j = i+1; j < N; j++){
            if(list[j]){
              if(A[j] % A[i] == 0){
                list[j] = false;
              }
              if(A[j] == A[i]){
                list[i] = false;
              }
            }
          }
          if(list[i]){
            count++;
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }

}