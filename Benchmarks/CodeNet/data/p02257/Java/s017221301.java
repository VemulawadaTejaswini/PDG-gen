import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for(int i = 0; i < n; i++) {
      boolean divisor = true;
      int a = sc.nextInt();
      if(a % 2 == 0 && a != 2) {
        continue;
      }
      for(int j = 2; j < a; j++) {
        if(a % j == 0) {
          divisor = false;
          break;
        }
      }
      if(divisor) {
        count++;
      }
    }
    System.out.println(count);
  }
}

