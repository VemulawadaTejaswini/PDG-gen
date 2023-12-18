import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N,K;
    int ans = 1;

    N = s.nextInt();
    K = s.nextInt();
    for(int i = 0; i < N ; i++){
      if(ans*2 <= ans + K){ans = ans*2;}
      else ans += K;
    }
    System.out.printf("%d",ans);
  }
}