import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] L = new int[N];
      for(int i = 0; i < N; i++){
        L[i] = sc.nextInt();
      }
      Arrays.sort(L);
      
      // カウント
      int count = 0;
      if(N >= 3){
        for(int i = 0; i < N; i++){
          for(int j = i+1; j < N; j++){
            for(int k = j+1; k < N; k++){
              int a = L[i];
              int b = L[j];
              int c = L[k];
              
              if(isDif(a,b,c)){
                if(c < a+b){
                  count++;
                }
              }
            }
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }
    
    // 3つの値が異なるか判定する関数
    public static boolean isDif(int a, int b, int c){
      boolean result = true;
      if(a == b){
        result = false;
      }else if(b == c){
        result = false;
      }else if(a == c){
        result = false;
      }
      
      return result;
    }
    

}