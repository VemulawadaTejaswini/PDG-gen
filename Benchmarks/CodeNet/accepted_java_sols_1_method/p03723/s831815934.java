import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    if (A%2 == 0 && A == B && B == C) {
      System.out.println(-1);
      return;
    }
    
    int ans = 0;
    while (A%2 == 0 && B%2 == 0 && C%2 == 0) {
      int AA = (B+C)/2;
      int BB = (C+A)/2;
      int CC = (A+B)/2;
      A = AA;
      B = BB;
      C = CC;
      ans++;
    }
    
    System.out.println(ans);
  }
}