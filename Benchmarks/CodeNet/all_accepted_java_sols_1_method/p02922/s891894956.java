import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int max =0,ans =0;
    for (int i=1; i<20; i++) {
      max = (A - 1) * i + 1;
      if (max >= B) {
        ans = i; 
        break;
      }
    }
    if (B == 1) {
      System.out.println(0);
    } else {
      System.out.print(ans);
    }
  }
}