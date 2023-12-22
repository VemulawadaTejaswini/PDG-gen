import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    long sum = 1;
    
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextLong();
      if (A[i] == 0) {
        sum = 0;
        break;
      } else if (A[i] > (1000000000000000000L / sum)) {
        sum = -1;
      } else {
        sum *= A[i];
      }
    } 
      System.out.println(sum);
                 
      sc.close();
  }
}
