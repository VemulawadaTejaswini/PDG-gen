import java.util.Scanner;
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    long M = Long.parseLong(sc.next());
    long ans =0;
    if (N * 2 >= M) {
      ans = M / 2;
    } else {
      ans = N + (M - 2 * N) / 4;
    }
    System.out.println(ans);
  }
}