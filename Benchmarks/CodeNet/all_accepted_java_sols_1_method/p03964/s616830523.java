import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    long prevT = 1;
    long prevA = 1;
    for (int i = 0; i < N; i++) {
      int T = sc.nextInt();
      int A = sc.nextInt();
      long ft = prevT/T + (prevT%T == 0 ? 0 : 1);
      long fa = prevA/A + (prevA%A == 0 ? 0 : 1);
      long f = Math.max(ft,fa);
      
      prevT = f*T;
      prevA = f*A;
    }
    System.out.println(prevT + prevA);
  }
}