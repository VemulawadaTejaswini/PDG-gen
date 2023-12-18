import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int T = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    
    double min = 10000.0;
    int ans = 0;
    for(int i = 1; i <= N; i++){
      int x = Integer.parseInt(sc.next());
      double d = T - x*0.006;
      double e = Math.abs(A-d);
      if(e < min){
        min = e;
        ans = i;
      }
    }
    System.out.println(ans);
  }
}