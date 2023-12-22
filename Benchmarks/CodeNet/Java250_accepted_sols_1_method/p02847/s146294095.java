import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static final String[] days = new String[] {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day = sc.nextLine();
    sc.close();
    int dayIndex = Arrays.asList(days).indexOf(day);
    System.out.println(7 - dayIndex);
  }
}
