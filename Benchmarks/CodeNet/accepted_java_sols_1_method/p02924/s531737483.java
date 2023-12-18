import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long count = 0;
    for(int i = 1; i < n; i++) {
      count += i;
    }
    System.out.println(count);

  }
}
