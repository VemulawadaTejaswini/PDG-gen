import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int min = 0;
    for (int i = 0; i < n; i++) {
      int a = scan.nextInt();
      int count = findMin(a, 0);
      if (i == 0 || count < min) {
        min = count;
      }
    }
    System.out.println(min);
  }
  
  private static int findMin(int n, int count) {
    if (n % 2 != 0) {
      return count;
    }
    return findMin(n / 2, ++count);
  }
}