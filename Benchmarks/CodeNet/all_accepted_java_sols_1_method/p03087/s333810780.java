import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), Q = sc.nextInt();
    String S = sc.next();
    int A[] = new int[S.length() + 1];
    for (int i = 1; i < S.length(); i++)
    {
      if (S.charAt(i - 1) == 'A' && S.charAt(i) == 'C')
      {
        A[i] = 1;
      }
      else
      {
        A[i] = 0;
      }
    }
    int PSA[] = new int[S.length() + 1];
    for (int i = 1; i <= S.length(); i++)
    {
      PSA[i] = PSA[i - 1] + A[i];
    }
    for (int i = 0; i < Q; i++)
    {
      int l = sc.nextInt(), r = sc.nextInt();
      int result = PSA[r - 1] - PSA[l - 1];
      System.out.println(result);
    }
  }
}
