import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    int n = in.nextInt();
    int[] A = new int[n];
    for (int i = 0; n != 0; i++) {
      A[i] = in.nextInt();
      n--;
    }
    
    int q = in.nextInt();
    for (int i = 0; q != 0; i++) {
      System.out.println((dfs(0, A, in.nextInt())) ? "yes" : "no" );
      q--;
    }
  }
  static boolean dfs(int p, int[] A, int t) {
    if (p == A.length)           return t == 0;
    if (dfs(p + 1, A, t - A[p])) return true;
    if (dfs(p + 1, A, t))        return true;
    return false;
  }
}