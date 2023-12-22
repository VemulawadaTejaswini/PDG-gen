import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] L = new int[N+1];
    for (int i = 1; i <= N; i++) {
      L[i] = sc.nextInt();
    }

    int ans = N+1;
    int D = 0;
    for (int i = 2; i <= N+1; i++) {
      D = D + L[i-1];
      if (X < D) {
        ans = i-1;
        break;
      }
    }
    
    System.out.println(ans);
  }
}
