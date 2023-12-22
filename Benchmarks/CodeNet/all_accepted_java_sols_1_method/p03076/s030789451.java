import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int ans = 0;
    for (int i = 0; i < 5; i++) {
      int t = sc.nextInt();
      int ceil = (int)Math.ceil(t/10.0)*10;
      ans += ceil;
      max = Math.max(max, ceil-t);
    }
    System.out.println(ans-max);
  }
}