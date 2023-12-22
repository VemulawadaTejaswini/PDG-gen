import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] L = new int[n];
    int sum = 0;
    for(int i = 0; i < n; i++) {
      L[i] = sc.nextInt();
      sum += L[i];
    }
    Arrays.sort(L);
    String ans = "No";
    if(L[n - 1] < (sum - L[n - 1])) ans = "Yes";
    System.out.println(ans);
  }
}