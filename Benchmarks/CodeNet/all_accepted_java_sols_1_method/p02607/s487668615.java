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
      
      // カウント
      int count = 0;
      for(int i = 0; i < N; i++){
        int index = i+1;
        if(index % 2 == 1 && A[i] % 2 == 1){
          count++;
        }
      }
      
      // 出力
      System.out.println(count);
    }

}