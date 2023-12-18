import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[][] board = new int[h][w];
    for (int i = 0; i < h; i++) {
      String l = sc.next();
      for (int j = 0; j < w; j++) {
        if (l.charAt(j) == '#') {
          board[i][j] = 1;
        }
      }
    }
    pw.println(recursive(board, 0, 0, h, w, k));
  }

  static int recursive(int[][] board, int currentH, int currentW, int h, int w, int expected) {
    if (currentH == h && currentW == w) {
      if (cont(board) == expected) {
        return 1;
      } else {
        return 0;
      }
    }
    if (currentH < h) {
      int ans = 0;
      ans += recursive(
        paintRow(copy(board, h, w), currentH, w), currentH + 1, currentW, h, w, expected);
      ans += recursive(board, currentH + 1, currentW, h, w, expected);
      return ans;
    }
    if (currentW < w) {
      int ans = 0;
      ans += recursive(
        paintCol(copy(board, h, w), currentW, h), currentH, currentW + 1, h, w,
        expected);
      ans += recursive(board, currentH, currentW + 1, h, w, expected);
      return ans;
    }
    throw new RuntimeException();
  }

  static int[][] copy(int[][] board, int h, int w) {
    int[][] clone = new int[h][w];
    for (int i = 0; i < h; i++) {
      clone[i] = Arrays.copyOf(board[i], w);
    }
    return clone;
  }

  static int[][] paintRow(int[][] board, int targetRow, int w) {
    for (int i = 0; i < w; i++) {
      board[targetRow][i] = 2;
    }
    return board;
  }

  static int[][] paintCol(int[][] board, int targetCol, int h) {
    for (int i = 0; i < h; i++) {
      board[i][targetCol] = 2;
    }
    return board;
  }

  static int cont(int[][] board) {
    int ans = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        ans += board[i][j] == 1 ? 1 : 0;
      }
    }
    return ans;
  }

  static void debug(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }
}
