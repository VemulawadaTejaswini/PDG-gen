import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    Integer c[][] = new Integer[3][3];
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        c[i][j] = sc.nextInt();
      }
    }
    int a,b;
    a = c[0][0] - c[0][1];
    b = c[0][1] - c[0][2];
    String ans = "Yes";
    for(int i=1; i<3; i++){
      if(a != c[i][0] - c[i][1] || b != c[i][1] - c[i][2]){
        ans = "No";
        break;
      }
    }
    for(int j=1; j<3; j++){
      if(c[0][0] - c[1][0] != c[0][j] - c[1][j] || c[1][0] - c[2][0] != c[1][j] - c[2][j]){
        ans = "No";
        break;
      }
    }
    out.println(ans);
          
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}