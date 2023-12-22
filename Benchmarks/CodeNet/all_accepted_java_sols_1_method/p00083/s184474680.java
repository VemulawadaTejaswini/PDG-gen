import java.util.*;

class Main {
  public static void main (String[] args) {

    Calendar m = Calendar.getInstance();
    Calendar t = Calendar.getInstance();
    Calendar s = Calendar.getInstance();
    Calendar h = Calendar.getInstance();

    m.set(1868, 9, 8);
    t.set(1912, 7, 30);
    s.set(1926, 12, 25);
    h.set(1989, 1, 8);

    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int yyyy = scanner.nextInt();
      int mm = scanner.nextInt();
      int dd = scanner.nextInt();
      Calendar in = Calendar.getInstance();
      in.set(yyyy, mm, dd);
      if (in.compareTo(m) < 0) {
        out += "pre-meiji\n";
        continue;
      }
      if (in.compareTo(t) < 0) {
        out += "meiji " + ((yyyy - 1868) + 1) + " " + mm + " " + dd + "\n";
        continue;
      }
      if (in.compareTo(s) < 0) {
        out += "taisho " + ((yyyy - 1912) + 1) + " " + mm + " " + dd + "\n";
        continue;
      }
      if (in.compareTo(h) < 0) {
        out += "showa " + ((yyyy - 1926) + 1) + " " + mm + " " + dd + "\n";
        continue;
      }
      out += "heisei " + ((yyyy - 1989) + 1) + " " + mm + " " + dd + "\n";
      continue;
    }
    System.out.print(out);
  }
}