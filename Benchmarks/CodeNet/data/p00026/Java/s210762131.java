
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public void run() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    Paper paper = new Paper(new int[10][10]);
    while ((in = reader.readLine()) != null) {
      Ink ink = readInk(in);
      paper.dripInk(ink);
    }
    System.out.println(paper.getNonColoredCellNum());
    System.out.println(paper.getMaxColorDepth());
  }

  public static Ink readInk(String str) {
    String[] splited = str.split(",");
    int x = Integer.parseInt(splited[0]);
    int y = Integer.parseInt(splited[1]);
    InkSize size = parseIntToInkSize(Integer.parseInt(splited[2]));
    return new Ink(x, y, size);
  }

  public static InkSize parseIntToInkSize(int num) {
    switch (num) {
      case 1:
        return InkSize.SMALL;
      case 2:
        return InkSize.MEDIUM;
      case 3:
        return InkSize.LARGE;
      default:
        return null;
    }
  }

  public static class Paper {

    public int[][] grid;

    public Paper(int[][] grid) {
      this.grid = grid;
    }

    public void dripInk(Ink ink) {
      int[][] spreadData = ink.size.getSpreadData();
      int maxSpreadXYSize = ink.size.getMaxSpreadXYSize();
      for (int i = 0; i < spreadData.length; i++) {
        for (int j = 0; j < spreadData[i].length; j++) {
          if (0 <= ink.x - maxSpreadXYSize + i && ink.x - maxSpreadXYSize + i < 10
                  && 0 <= ink.y - maxSpreadXYSize + j && ink.y - maxSpreadXYSize + j < 10) {
            if (spreadData[i][j] == 1)
              grid[ink.x - maxSpreadXYSize + i][ink.y - maxSpreadXYSize + j]++;
          }
        }
      }
    }

    public int getNonColoredCellNum() {
      int num = 0;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          if (grid[i][j] == 0)
            num++;
        }
      }
      return num;
    }

    public int getMaxColorDepth() {
      int max = 0;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          if (grid[i][j] > max)
            max = grid[i][j];
        }
      }
      return max;
    }

  }

  public static class Ink {

    public int x;
    public int y;
    public InkSize size;

    public Ink(int x, int y, InkSize size) {
      this.x = x;
      this.y = y;
      this.size = size;
    }

  }

  public static enum InkSize {

    SMALL(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 1),
    MEDIUM(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, 1),
    LARGE(new int[][]{{0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}}, 2);
    private final int[][] spreadData;
    private final int maxSpreadXYSize;

    private InkSize(int[][] spreadData, int maxSpreadXYSize) {
      this.spreadData = spreadData;
      this.maxSpreadXYSize = maxSpreadXYSize;
    }

    public int[][] getSpreadData() {
      return spreadData;
    }

    public int getMaxSpreadXYSize() {
      return maxSpreadXYSize;
    }

  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    main.run();
  }

}