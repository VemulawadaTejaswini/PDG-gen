import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    List<Integer> prime = new ArrayList<>();
    for (int i = 2; i <= N; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i%j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        prime.add(i);
      }
    }
    
    int[] factor = new int[N+1];
    for (int i = 2; i <= N; i++) {
      for (int p : prime) {
        if (p > i) {
          break;
        }
        int n = i;
        while (n > 1 && n%p == 0) {
          factor[p]++;
          n /= p;
        }
      }
    }
    
    long ans = 1;
    for (int i = 2; i <= N; i++) {
      if (factor[i] > 0) {
        ans = ans * (factor[i]+1) % 1000000007;
      }
    }
 
    System.out.println(ans);
  }
}