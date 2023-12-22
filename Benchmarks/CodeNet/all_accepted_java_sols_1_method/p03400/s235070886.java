import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    
    int ans = X+N;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      for(int j = n+1; j <= D; j += n){
        ans++;
      }
    }
    System.out.println(ans);
  }
}