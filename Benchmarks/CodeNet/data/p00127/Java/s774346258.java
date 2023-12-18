import java.util.*;

class Main {
  public static void main (String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    map.put("11", "a");
    map.put("12", "b");
    map.put("13", "c");
    map.put("14", "d");
    map.put("15", "e");
    map.put("21", "f");
    map.put("22", "g");
    map.put("23", "h");
    map.put("24", "i");
    map.put("25", "j");
    map.put("31", "k");
    map.put("32", "l");
    map.put("33", "m");
    map.put("34", "n");
    map.put("35", "o");
    map.put("41", "p");
    map.put("42", "q");
    map.put("43", "r");
    map.put("44", "s");
    map.put("45", "t");
    map.put("51", "u");
    map.put("52", "v");
    map.put("53", "w");
    map.put("54", "x");
    map.put("55", "y");
    map.put("61", "z");
    map.put("62", ".");
    map.put("63", "?");
    map.put("64", "!");
    map.put("65", " ");
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.length() % 2 == 1) {
        out += "NA\n";
        continue;
      }
      String work = "";
      for (int ii = 0; ii < line.length(); ii += 2) {
        String p = line.substring(ii, ii + 2);
        Character pc1 = p.charAt(0);
        Character pc2 = p.charAt(1);
        if (Character.isDigit(pc1) == false || Character.isDigit(pc2) == false) {
          out += "NA";
          work = "";
          break;
        }
        int p1 = Integer.parseInt(p.substring(0, 1));
        int p2 = Integer.parseInt(p.substring(1));
        if (p1 < 1 || 6 < p1 || p2 < 1 || 5 < p2) {
          out += "NA";
          work = "";
          break;
        }
        work += map.get(p);
      }
      out += work + "\n";
    }
    System.out.print(out);
  }
}