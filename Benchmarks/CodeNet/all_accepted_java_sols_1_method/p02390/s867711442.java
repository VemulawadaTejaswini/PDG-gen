import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    int h = 60 * 60;
    int hour = s / h;
    int m = s % h;
    int minute = m / 60;
    int second = m - minute * 60;

    System.out.println(hour + ":" + minute + ":" + second);
    sc.close();
  }
}
