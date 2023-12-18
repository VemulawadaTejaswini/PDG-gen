import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int ans = K;
    
    if(N != 1){
      for(int i = 0; i < N - 1; i++){
        ans *= (K - 1);
      }
    }
    
    System.out.println(ans);
  }
}