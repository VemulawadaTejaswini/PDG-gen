import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] cns = {"black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white"};
    int[][] cs = {{0, 0, 0},
                  {0, 0, 255},
                  {0, 255, 0},
                  {0, 255, 255},
                  {255, 0, 0},
                  {255, 0, 255},
                  {255, 255, 0},
                  {255, 255, 255}};
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.equals("0")) {
        break;
      }
      int hikaru = Integer.parseInt(line.substring(1, 3), 16);
      int umi = Integer.parseInt(line.substring(5, 7), 16);
      int fuu = Integer.parseInt(line.substring(3, 5), 16);
      int topc = 0;
      double topd = Double.MAX_VALUE;
      for (int ii = 0; ii < 8; ii++) {
        double d = Math.sqrt((cs[ii][0] - hikaru) * (cs[ii][0] - hikaru) +
                             (cs[ii][2] - umi) * (cs[ii][2] - umi) +
                             (cs[ii][1] - fuu) * (cs[ii][1] - fuu));
        if (d < topd) {
          topc = ii;
          topd = d;
        }
      }
      System.out.println(cns[topc]);
    }
  }
}