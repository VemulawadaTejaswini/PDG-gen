import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int res = 0;

    switch (s) {
      case "SUN":
        ++res;
      case "MON":
        ++res;
      case "TUE":
        ++res;
      case "WED":
        ++res;
      case "THU":
        ++res;
      case "FRI":
        ++res;
      case "SAT":
        ++res;
    }

    System.out.println(res);
  }
}