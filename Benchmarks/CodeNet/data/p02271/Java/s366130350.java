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
    int[] M = new int[q];
    for (int i = 0; q != 0; i++) {
      M[i] = in.nextInt();
      q--;
    }
     
    for (int i = 0; i < M.length; i++) {
      System.out.println((dfs(0, A, 0, M[i])) ? "yes" : "no" );
    }
  }
  static boolean dfs(int p, int[] A, int t, int sum) {
    if (t > sum ) return false;
    if (p == A.length) return t == sum;
    if (dfs(p + 1, A, t + A[p], sum)) return true;
    if (dfs(p + 1, A, t, sum))        return true;
    return false;
  }
}