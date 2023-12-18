import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int count = 1;
    while (true) {
      if ((x * count) % 360 == 0) break;
      count++;
    }
    System.out.println(count);
  }
}
