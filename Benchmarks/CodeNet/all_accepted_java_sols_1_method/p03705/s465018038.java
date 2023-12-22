import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long ans = 0;
    if(N == 1) {
      if(A == B) ans = 1;
    } else {
      if(A <= B) ans = A + (N - 1) * B - ((N - 1) * A + B - 1); 
    }
    System.out.println(ans);
  }
}