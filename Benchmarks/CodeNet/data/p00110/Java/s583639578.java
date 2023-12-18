import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    char[] cs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
out += "NA\n";
continue;
/***
      String[] works1 = line.split("=");
      String c = works1[1];
      String[] works2 = works1[0].split("\\+");
      String a = works2[0];
      String b = works2[1];
      boolean flag = false;
      for (int ii = 0; ii <= 9; ii++) {
        int aa = Integer.parseInt(a.replace('X', cs[ii]));
        int bb = Integer.parseInt(b.replace('X', cs[ii]));
        int cc = Integer.parseInt(c.replace('X', cs[ii]));
        if (aa + bb == cc) {
          flag = true;
          out += ii + "\n";
          break;
        }
      }
      if (!flag) {
        out += "NA\n";
      }
***/
    }
    System.out.print(out);
  }
}