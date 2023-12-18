import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int next = 0;

    switch (s) {
      case "SUN":
        next = 7;
        break;
      case "MON":
        next = 6;
        break;
      case "TUE":
        next = 5;
        break;
      case "WED":
        next = 4;
        break;
      case "THU":
        next = 3;
        break;
      case "FRI":
        next = 2;
        break;
      case "SAT":
        next = 1;
        break;
    }
    System.out.println(next);
  }

}
