import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= M; j++) {
        if (M*i + N*j - i*j*2 == K) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}