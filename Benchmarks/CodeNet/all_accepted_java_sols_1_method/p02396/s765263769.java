import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while(true) {
      count++;
      int a = sc.nextInt();
      if(a == 0) {
        break;
      } else {
        System.out.println("Case " + count + ": " + a);
      }
    }
  }
}

