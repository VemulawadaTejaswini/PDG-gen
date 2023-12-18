import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      boolean[] isPrime = new boolean[n+1];
      for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
      }
      for (int i = 2; i*i <= n; i++) {
        if(isPrime[i]) {
          for (int j = 2*i; j <= n; j += i) {
            isPrime[j] = false;
          }
        }
      }
      int counter = 0;
      for (int i = 1; i <= n/2; i++) {
        if(isPrime[i] && isPrime[n-i]) {
          counter++;
        }
      }
      System.out.println(counter);
    }
  }
}