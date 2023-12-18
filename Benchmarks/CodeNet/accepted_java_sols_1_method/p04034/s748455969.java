import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    int[] balls = new int[N];
    boolean[] check = new boolean[N];
    check[0] = true;
    
    for(int i = 0; i < N; i++){
      balls[i] = 1;
    }
    
    for(int i = 0; i < M; i++){
      String[] T = sc.nextLine().split(" ");
      int A = Integer.parseInt(T[0]);
      int B = Integer.parseInt(T[1]);
      
      balls[A-1]--;
      balls[B-1]++;
      if(check[A-1]){
        check[B-1] = true;
      }
      if(balls[A-1] == 0){
        check[A-1] = false;
      }
    }
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(balls[i] > 0 && check[i]){
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}