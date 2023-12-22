import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N-1];
      for(int i = 0; i < N-1; i++){
        A[i] = sc.nextInt();
      }
      
      // 部下人数の算出
      int[] counter = new int[N];
      for(int i = 0; i < N; i++){
        counter[i] = 0;
      }
      
      for(int i = 0; i < N-1; i++){
        int managerId = A[i]-1;
        counter[managerId]++;
      }
      
      
      // 出力
      for(int i = 0; i < N; i++){
        System.out.println(counter[i]);
      }
    }
    
}