import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int h = scanner.nextInt();
      int w = scanner.nextInt();
      scanner.nextLine();
      if (w == 0 && h == 0) {
        break;
      }
      String[][] f = new String[h][w];
      for (int row = 0; row < h; row++) {
        String line = scanner.nextLine();
        for (int col = 0; col < w; col++) {
          f[row][col] = line.substring(col, col + 1);
        }
      }

      for (int row = 0, col = 0, step = 0;;step++) {
        if (f[row][col].equals(".")) {
          out += String.format("%d %d\n", col, row);
          break;
        }
        if (step > w * h) {
          out += "LOOP\n";
          break;
        }
        if (f[row][col].equals(">")) {
          col++;
        } else if (f[row][col].equals("<")) {
          col--;
        } else if (f[row][col].equals("v")) {
          row++;
        } else if (f[row][col].equals("^")) {
          row--;
        }
      }

    }
    System.out.print(out);
  }
}