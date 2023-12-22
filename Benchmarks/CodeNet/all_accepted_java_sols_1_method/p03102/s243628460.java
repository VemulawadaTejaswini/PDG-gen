import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    
    int[] A = new int[M];
    for (int i = 0; i < M; i++){
      A[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < N; i++){
      int s = 0;
      for (int j = 0; j < M; j++){
        int B = sc.nextInt();
        s += A[j] * B;
      }
      if (s+C > 0) ans++;
    }
    System.out.println(ans);
  }
}
    