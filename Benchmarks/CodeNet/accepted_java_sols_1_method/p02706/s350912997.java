import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] A = new int[M];
      for(int i = 0; i < M; i++){
        A[i] = sc.nextInt();
      }
      
      // 宿題日の合計を算出
      int homework = 0;
      for(int i = 0; i < M; i++){
        homework += A[i];
      }
      
      // 遊び日数の算出
      int play = -1;
      if(homework <= N){
        play = N - homework;
      }
      
      // 出力
      System.out.println(play);
    }
    
}