import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long a =1, b=1;
    for (int i =1; i<=N; i++) {
      long T = sc.nextInt();
      long A = sc.nextInt();
      long k = Math.max(Math.max(1,a/T),Math.max(1,b/A));
      while (T * k < a  || A * k < b) {
        k++;
      }
      a = T * k;
      b = A * k;
    }
    System.out.println(a + b);
  }
}