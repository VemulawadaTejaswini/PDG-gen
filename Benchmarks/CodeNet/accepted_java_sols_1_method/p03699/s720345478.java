import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int sum = 0;
    int[] s = new int[N];
    for (int i = 0; i < N; i++) {
      s[i] = sc.nextInt();
      sum += s[i];
    }
    Arrays.sort(s);
    
    int sub = 0;
    for (int i = 0; i < N; i++) {
      if (s[i]%10 != 0) {
        sub = s[i];
        break;
      }
    }
    if (sub == 0) {
      System.out.println(0);
      return;
    }
    
    System.out.println(sum%10 != 0 ? sum : sum - sub);
  }
}