import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) { P[i] = sc.nextInt(); }
    
    int ans = 0;
    int min = 1000000;
    for (int i = 0; i < N; i++) {
      if (P[i] < min) {
        ans++;
      }
      min = Math.min(min, P[i]);
    }
    
    System.out.println(ans);
    
  }
}