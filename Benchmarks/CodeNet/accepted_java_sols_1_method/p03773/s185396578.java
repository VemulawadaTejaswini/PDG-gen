import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int time = scanner.nextInt();
    int addTime = scanner.nextInt();
    int startTime = time + addTime;

    if(startTime > 23) {
      System.out.println(startTime - 24);
    } else {
      System.out.println(startTime);
    }
  }
}
