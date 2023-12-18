import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int[][] board = new int[20][20];
    int[] hp = new int[8];
    int[] vp = new int[8];
    int row = 4;
    int twoCnt = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.length() != 8) {

        for (int ii = 0; ii < 8; ii++) {
          if (hp[ii] == 4) {
            out += "C\n";
            break;
          }
          if (vp[ii] == 4) {
            out += "B\n";
            break;
          }
          if (hp[ii] == 2) {
            twoCnt++;
          }
          if (vp[ii] == 2) {
            twoCnt++;
          }
        }
        if (twoCnt == 4) {
          out += "A\n";
        }
        boolean isResolve = false;
        for (int ii = 4; ii < 4 + 8; ii++) {
          for (int jj = 4; jj < 4 + 8; jj++) {
            if (board[ii][jj] == 1 && board[ii + 1][jj + 2] == 1) {
              out += "E\n";
              isResolve = true;
              break;
            }
            if (board[ii][jj] == 1 && board[ii + 2][jj + 1] == 1) {
              out += "F\n";
              isResolve = true;
              break;
            }
            if (board[ii][jj] == 1 && board[ii + 1][jj - 2] == 1) {
              out += "G\n";
              isResolve = true;
              break;
            }
            if (board[ii][jj] == 1 && board[ii + 2][jj - 1] == 1) {
              out += "D\n";
              isResolve = true;
              break;
            }
          }
          if (isResolve) {
            break;
          }
        }
        row = 4;
        twoCnt = 0;
        for (int ii = 4; ii < 4 + 8; ii++) {
          hp[ii - 4] = 0;
          vp[ii - 4] = 0;
          for (int jj = 4; jj < 4 + 8; jj++) {
            board[ii][jj] = 0;
          }
        }
        continue;
      }
      for (int ii = 4; ii < 4 + 8; ii++) {
        char p = line.charAt(ii - 4);
        if (p == '0') {
          board[row][ii] = 0;
        } else {
          board[row][ii] = 1;
        }
        hp[row - 4] += board[row][ii];
        vp[ii - 4] += board[row][ii];
      }
      row++;
    }

        for (int ii = 0; ii < 8; ii++) {
          if (hp[ii] == 4) {
            out += "C\n";
            break;
          }
          if (vp[ii] == 4) {
            out += "B\n";
            break;
          }
          if (hp[ii] == 2) {
            twoCnt++;
          }
          if (vp[ii] == 2) {
            twoCnt++;
          }
        }
        if (twoCnt == 4) {
          out += "A\n";
        }
        boolean isResolve = false;
        for (int ii = 4; ii < 4 + 8; ii++) {
          for (int jj = 4; jj < 4 + 8; jj++) {
            if (board[ii][jj] == 1 && board[ii + 1][jj + 2] == 1) {
              out += "E\n";
              isResolve = true;
              break;
            }
            if (board[ii][jj] == 1 && board[ii + 2][jj + 1] == 1) {
              out += "F\n";
              isResolve = true;
              break;
            }
            if (board[ii][jj] == 1 && board[ii + 1][jj - 2] == 1) {
              out += "G\n";
              isResolve = true;
              break;
            }
            if (board[ii][jj] == 1 && board[ii + 2][jj - 1] == 1) {
              out += "D\n";
              isResolve = true;
              break;
            }
          }
          if (isResolve) {
            break;
          }
        }

    System.out.print(out);
  }