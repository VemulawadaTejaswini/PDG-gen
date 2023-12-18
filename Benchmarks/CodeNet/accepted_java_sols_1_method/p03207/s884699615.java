import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int sum = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      int p = sc.nextInt();
      sum += p;
      if (max < p) {
        max = p;
      }
    }
    
    System.out.println(sum - max/2);
  }
}