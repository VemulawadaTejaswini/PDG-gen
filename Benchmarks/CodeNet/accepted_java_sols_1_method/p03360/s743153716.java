import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    int mx = A;
    if(mx < B) {
      mx = B;
    }
    if(mx < C) {
      mx = C;
    }
    System.out.println(A + B + C + mx * ((1 << K) - 1));
  }
}