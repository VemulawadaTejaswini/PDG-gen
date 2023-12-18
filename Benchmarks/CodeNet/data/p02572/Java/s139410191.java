import java.util.*;
public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    long sqSum = 0;
    long sum = 0;
    for (int i = 0; i < n; i++) {
      long x = input.nextInt();
      sum += x;
      sum %= 1_000_000_007;
	  sqSum += ((x * x) % 1_000_000_007);
      sqSum %= 1_000_000_007;
    }
    
    System.out.println(((sum * sum) % 1_000_000_007 - sqSum + 1_000_000_007) / 2);
  }
}