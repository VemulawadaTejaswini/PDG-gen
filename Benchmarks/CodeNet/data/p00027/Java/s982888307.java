import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] sumDays = {-1, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
    String[] weeks = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
    String out = "";
    while (scanner.hasNext()) {
      int month = scanner.nextInt();
      int day = scanner.nextInt();
      if (month == 0) {
        break;
      }
      out += weeks[(sumDays[month] + day) % 7] + "\n";
    }
    System.out.print(out);
  }
}