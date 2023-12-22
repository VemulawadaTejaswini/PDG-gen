import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int number = 0;
    for (int i = 1; i <= N; i++) {
      int j = i;
      int total = 0;
      total += (j % 10);
      while ((j / 10) != 0) {
        j /= 10;
        total += (j % 10);
      }
    
      if (total >= A && total <= B) {
        number += i;
      }
    }
    System.out.println(number);
  }
}