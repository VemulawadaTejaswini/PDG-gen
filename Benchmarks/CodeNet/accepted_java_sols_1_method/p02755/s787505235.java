import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = -1;
    for(int i = 1; i <= 1000; i++) {
      int C = (((int)8 * i) / (int)100);
      int D = (((int)10 * i) / (int)100);
      if((A == C) && (B == D)) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}