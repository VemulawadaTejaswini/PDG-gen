import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    
    int leftCount = 0;
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      if (a < X) {
        leftCount++;
      }
    }
    
    System.out.println(M/2 < leftCount ? M - leftCount : leftCount);
  }
}