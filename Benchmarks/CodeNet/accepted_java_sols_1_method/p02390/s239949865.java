import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hours, minutes, seconds;
    int time = Integer.parseInt(sc.next());
    hours = time / 3600;
    minutes = (time % 3600) / 60;
    seconds = time % 60;
    System.out.println(hours + ":" + minutes + ":" + seconds);
  }
}
