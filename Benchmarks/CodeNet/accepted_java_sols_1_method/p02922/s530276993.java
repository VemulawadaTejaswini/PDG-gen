import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int x = 1;
    int ans = 0;
    for (int i = 0;x < b;i++) {
      x += a - 1;
      ans ++;
    }
    System.out.println(ans);
  }
}



