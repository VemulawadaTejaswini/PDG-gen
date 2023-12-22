import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 0;
    int maxNum = 1;
    for (int i = 1; i <= n; i++) {
      int num = i;
      int count = 0;
      while (true) {
        if (num % 2 == 0) {
          num = num / 2;
          count++;
        } else {
          if (count > max) {
            max = count;
            maxNum = i;
          }
          break;
        }
      }
    }
    System.out.println(maxNum);
  }
}