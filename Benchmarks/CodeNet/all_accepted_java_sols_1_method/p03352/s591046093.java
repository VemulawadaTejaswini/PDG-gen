import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x == 1) {
      System.out.println(x);
      return;
    }
    int ans = 0;
    for(int i = 2; Math.pow(i, 2) <= x; i++) {
      for(int j = 2; Math.pow(i, j) <= x; j++) {
        if(ans < Math.pow(i, j)) {
          ans = (int)Math.pow(i, j);
        }
      }
    }
    System.out.println(ans);
  }

}
