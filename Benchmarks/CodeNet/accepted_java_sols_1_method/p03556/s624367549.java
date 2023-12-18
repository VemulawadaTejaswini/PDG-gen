import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 1;
    for (int i = 1; i * i <= N; i++) {
      ans = i * i;
    }
    System.out.println(ans);
  }
}