import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    long p = 0;
    int ki = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      sum += a;
      if(a % 2 == 1) ki++;
      if((a == 0) || (i == n - 1)) {
        if(ki % 2 == 1) p++;
        ki = 0;
      }
    }
    System.out.println((sum - p) / 2);
  }
}