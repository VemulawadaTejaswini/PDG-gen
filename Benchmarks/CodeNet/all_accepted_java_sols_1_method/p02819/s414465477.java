import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ans = 0;
    for(int i = x; i < 1000000; i++) {
      int p = 0;
      for(int j = 2; (j * j) <= i; j++) {
        if((i % j) == 0) {
          p++;
          break;
        }
      }
      if(p == 0) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}