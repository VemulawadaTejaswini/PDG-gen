import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] works = line.split(",");
      double w = Double.parseDouble(works[1]);
      double h = Double.parseDouble(works[2]);
      double bmi = w / (h * h);
      if (bmi >= 25) {
        out += works[0] + "\n";
      }
    }
    System.out.print(out);
  }
}