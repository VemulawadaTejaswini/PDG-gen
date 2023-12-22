import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int rank[] = new int[9];
    for(int i=0; i<N; i++){
      int a = sc.nextInt();
      if(a < 3200) rank[a / 400]++;
      else rank[8]++;
    }
    int min = 0;
    for(int i=0; i<8; i++){
      if(rank[i] > 0) min++;
    }
    int max = min + rank[8];
    if(min == 0){
      min = 1;
      max = rank[8];
    }
    out.println(min + " " + max);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}