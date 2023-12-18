import java.util.*;

class Board {
  int[] Q;
  boolean[] filled;

  Board() {
    Q = new int[8];
    filled = new boolean[8];
    Arrays.fill(Q, -1);
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    for (int i = 0; i < k; ++i) {
      int r = sc.nextInt();
      filled[r] = true;
      int c = sc.nextInt();
      Q[r] = c;
    }
  }

  boolean solve(int row) {
    if (row >= 8) {
      return true;
    }
    if (filled[row]) {
      return solve(row + 1);
    }
    for (int c = 0; c < 8; ++c) {
      if (can_place(row, c)) {
        Q[row] = c;
        if (solve(row + 1)) {
          return true;
        }
        Q[row] = -1;
      }
    }
    return false;
  }

  // pre : *haven't* placed in the same row
  boolean can_place(int row, int col) {
    for (int r = 0; r < 8; ++r) {
      if (Q[r] == col) return false;
      int row_difference = Math.abs(r - row);
      if (Q[r] >= 0 && (Q[r] == col + row_difference || Q[r] == col - row_difference)) return false;
    }
    return true;
  }

  void print() {
    for (int r = 0; r < 8; ++r) {
      for (int c = 0; c < Q[r]; ++c) {
        System.out.print(".");
      }
      System.out.print("Q");
      for (int c = Q[r] + 1; c < 8; ++c) {
        System.out.print(".");
      }
      System.out.println();
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Board b = new Board();
    b.solve(0);
    b.print();
  }
}
