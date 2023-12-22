import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int alice = 0;
    int bob = 0;
    for (int i = N-1; i >= 0; i--) {
      if ((N-1)%2 == i%2) {
        alice += a[i];
      } else {
        bob += a[i];
      }
    }
    
    System.out.println(alice - bob);
  }
}