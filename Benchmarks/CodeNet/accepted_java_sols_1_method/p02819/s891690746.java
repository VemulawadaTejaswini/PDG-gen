import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    boolean[] is_prime = new boolean[2 * x + 1];
    for(int i = 1; i <= (2 * x); i++) {
      is_prime[i] = true;
    }
    is_prime[2] = true;
    for(int i = 2; i <= (2 * x); i++) {
      if(is_prime[i]) {
        for(int j = (2 * i); j <= (2 * x); j += i) {
          is_prime[j] = false;
        }
      } 
    }
    int ans = 0;
    for(int i = x; i <= (2 * x); i++) {
      if(is_prime[i]) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}