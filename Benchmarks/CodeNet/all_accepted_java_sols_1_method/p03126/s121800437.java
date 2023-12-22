import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //人数
    int N = sc.nextInt();
    //種類
    int M = sc.nextInt();
    //みんなの好きなもの
    int[][] like = new int[N][M+1];
    for(int i = 0; i < N; ++i){
      like[i][0] = sc.nextInt();
      for(int j = 1; j <= like[i][0]; ++j){
          like[i][j] = sc.nextInt();
      }
    }
    
    //みんなが好きなもの数える用
    int count[] = new int[M];
    for(int i = 0; i < M; ++i){
      count[i] = 0;
    }
    
    //数えよう
    for(int i = 0; i < N; ++i){
      for(int j = 1; j < M+1; ++j){
        for(int k = 1; k <= M; ++k){
          if(k == like[i][j]){
            count[k-1] ++;
          }
        }
      }
    }
    
    int ans = 0;
    
    for(int i = 0; i < M; ++i){
      if(count[i] == N){       
        ans++;        
      }
    }
    
    System.out.println(ans);
        
  } 
}