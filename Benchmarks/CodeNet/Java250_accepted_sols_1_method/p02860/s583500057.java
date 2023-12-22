import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String ans = "No";
    
    if (N % 2 == 0) {
      String s1 = S.substring(0, N/2);
      String s2 = S.substring(N/2, N);
      if (s1.equals(s2))
        ans = "Yes";
    }
    
    System.out.print(ans);
  }
}