import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A,B,C,X,Y;
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    X = sc.nextInt();
    Y = sc.nextInt();
    int pizaC = 2 * Math.max(X,Y);
    int pizaA, pizaB;
    int ans = INF;
    int tmp;
    while(pizaC >= 0){
      pizaA = Math.max(0, X - pizaC/2);
      pizaB = Math.max(0, Y - pizaC/2);
      tmp = pizaA * A + pizaB * B + pizaC * C;
      ans = Math.min(tmp, ans);
      pizaC--;
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}