import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] arr = sc.next().toCharArray();
    int total = 0;
    for (char c : arr) {
      if (c == 'R') {
        total++;
      } else {
        total--;
      }
    }
    if (total > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}