import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int ans;
    if(S % 2 ==0) {
      ans = S / 2;
    } else {
      ans = S /2 + 1;
    }
    System.out.println(ans);
  }
}