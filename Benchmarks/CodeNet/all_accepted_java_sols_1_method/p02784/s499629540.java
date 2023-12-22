import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    String ans = "No";
    long sum = 0;
    Arrays.sort(A);
    for (int i = A.length - 1; -1 < i; i--) {
      sum += A[i];
      if (H <= sum) {
        ans = "Yes";
        break;
      }
    }
    System.out.println(ans);
  }
}