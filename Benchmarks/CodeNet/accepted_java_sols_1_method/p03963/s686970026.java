import java.util.*;
 
public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int ans = 0;
    ans = (int) Math.pow(K-1,N-1);
    System.out.println(ans*K);
  }
}