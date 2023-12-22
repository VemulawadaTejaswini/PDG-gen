import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      int max = 0;
      int sum = 0;
      
      for (int i = 0; i < N; ++i) {
        int L = in.nextInt();
        
        max = Math.max(max, L);
        sum += L;
      }
      
      sum -= max;
      
      if (sum > max) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}