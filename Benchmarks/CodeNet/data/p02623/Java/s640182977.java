import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int K = sc.nextInt();
      int[] A = new int[N];
      int[] B = new int[M];
      long[] Atotal = new long[N+1];
      long[] Btotal = new long[M+1];
      int Amax = 0;
      int Bmax = 0;
      
      Atotal[0] = 0;
      for(int i = 0; i < N+1; i++){
        if(i < N){
          A[i] = sc.nextInt();
        }
        if(i > 0){
          Atotal[i] = Atotal[i-1] + A[i-1];
          if(Amax == 0 && Atotal[i] > K){
            Amax = i-1;
          }
        }
      }
      if(Amax == 0){
        Amax = N;
      }
      
      Btotal[0] = 0;
      B[0] = sc.nextInt();
      for(int i = 1; i < M+1; i++){
        if(i < M){
          B[i] = sc.nextInt();
        }
        if(i > 0){
          Btotal[i] = Btotal[i-1] + B[i-1];
          if(Bmax == 0 && Btotal[i] > K){
            Bmax = i-1;
          }
        }
      }
      if(Bmax == 0){
        Bmax = M;
      }
      
      // 全部読み切れるか
      int result = 0;
      if(Atotal[N] + Btotal[M] <= K){
        result = N+M;
      }else if(Amax == 0 && Bmax == 0){
        // 1冊も読めないか
        result = 0;
      }else{
        long totalTime = 0;
        int totalMax = 0;
        for(int i = 0; i <= Amax; i++){
          for(int j = 0; j <= Bmax; j++){
            totalTime = Atotal[i] + Btotal[j];
            if(totalTime <= K){
              //System.out.println(i + " " + j + " " + totalTime);
              
              int max = i+j;
              if(totalMax < max){
                totalMax = max;
              }
            }else{
              break;
            }
          }
        }
        result = totalMax;
      }
      
      // 出力
      System.out.println(result);
    }
    

}