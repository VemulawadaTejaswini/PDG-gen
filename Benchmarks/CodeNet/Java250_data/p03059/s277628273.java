import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();

    int bCount = 0;

    for (int curentTime = a; curentTime <= t; curentTime += a ) {
      bCount += b;
    }
    System.out.println(bCount);
  }
}