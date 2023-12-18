import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int r[] = new int[m*2];
    int cnt[] = new int[n];
    
    
    //入力値を配列に格納
    for(int i = 0; i < m*2; ++i){
      r[i] = sc.nextInt();
    }

    for(int i = 1; i<=n; ++i){

      for(int j = 0; j < m*2 ; ++j){
        if(i==r[j]){
          cnt[i-1] += 1;
        }
      
      }
      
      System.out.println(cnt[i-1]);       
    }
  }
}