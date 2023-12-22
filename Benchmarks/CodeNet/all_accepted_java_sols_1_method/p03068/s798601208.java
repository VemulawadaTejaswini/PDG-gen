import java.util.*;
import static java.lang.System.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int K = sc.nextInt();
    StringBuilder SB = new StringBuilder();
    String x = S.substring(K-1,K);
    for (int i=0; i<N; i++) {
      if (S.substring(i,i+1).equals(x))
        SB.append(x);
      else
        SB.append("*");
    }
    out.println(SB);
  }
}