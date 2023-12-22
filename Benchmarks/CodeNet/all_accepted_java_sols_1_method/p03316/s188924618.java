import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long N = sc.nextLong();
    long a = 0;
    long c_N = N;
    
    while (N != 0) {
      a += N % 10;
      N /= 10;
    }
    
    System.out.println(c_N % a == 0 ? "Yes" : "No");
  }
}
