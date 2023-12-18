import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int seconds = sc.nextInt();
    String oclock = convertSecondsToOclock(seconds);

    System.out.println(oclock);
  }

  private static String convertSecondsToOclock(int seconds) {
    int hours = 0;
    int minutes = 0;

    while (seconds >= 60) {
      if (seconds >= 3600) {
        seconds -= 3600;
        hours++;
      } else {
        seconds -= 60;
        minutes++;
      }
    }
    return String.format("%d:%d:%d", hours, minutes, seconds);
  }
}