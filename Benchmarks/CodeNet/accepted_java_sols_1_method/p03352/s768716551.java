import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int ans = 0;
    for (int i = 2; i <= 9; i++) {
      for (int j = 0; j <= 31; j++) {
        if (X >= (int) Math.pow(j, i)) {
          ans = Math.max(ans, (int) Math.pow(j, i));
        }
      }  
    }
    System.out.println(ans);
  }
}