import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int[] count = new int[N+1];
    long ans =1;
    for (int i =2; i<=N; i++) {
      int a =2, b =i;
        while (a <= b) {
          if (b % a == 0) {
            count[a]++;
            b /= a;
            continue;
          }
          a++;
        }
    }
    for (int i =2; i<=N; i++) {
      ans *= (count[i] + 1);
      ans %= 1000000007;
    }
    System.out.print(ans); 
  }
}