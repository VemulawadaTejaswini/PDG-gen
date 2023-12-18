import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      
      int n = Integer.parseInt(br.readLine());
      String[] lines;
      Board board = new Board(8);
      int row,col;
      for(int i=0; i<n; i++) {
        lines = br.readLine().split(" ");
        row = Integer.parseInt(lines[0]);
        col = Integer.parseInt(lines[1]);
        board.fixedQueen(row, col);
      }

      if(board.computeQueenLayout(0))
        board.dispBoardAnswer();
      else
        System.out.println("Answer is Nothing!");
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

  class Board {

    private int n;
    private boolean done;
    private boolean[][] fixed;
    private boolean[][] board;
    private boolean[] row, col, dPos, dNeg;

    public Board(int n) {
      this.n = n;
      fixed  = new boolean[n][n];
      board  = new boolean[n][n];
      row    = new boolean[n];
      col    = new boolean[n];
      dPos   = new boolean[2*n-1];
      dNeg   = new boolean[2*n-1];
    }

    public boolean fixedQueen(int row, int col) {
      if(putQueen(row, col))
        fixed[row][col] = true;
      else return false;

      return true;
    }
    private boolean putQueen(int row, int col) {
      if(isQueen(row, col)) return false;
      if(this.row[row] | this.col[col] |
         dPos[row+col] | dNeg[row-col+n-1] ) return false;

      board[row][col] = true;
      this.row[row]   = this.col[col] =
      dPos[row + col] = dNeg[row-col + n-1] = true;

      return true;
    }
    private boolean takeQueen(int row, int col) {
      if(!isQueen(row, col)) return false;

      board[row][col] = false;
      this.row[row] = this.col[col] =
      dPos[row + col] = dNeg[row-col + n-1] = false;

      return true;
    }
    private boolean isFixed(int row, int col) {
      return fixed[row][col];
    }
    private boolean isQueen(int row, int col) {
      return board[row][col];
    }
    private boolean isFree(int row, int col) {
      return !( this.row[row] | this.col[col] |
        dPos[row + col] | dNeg[row-col + n-1]);
    }

    public boolean computeQueenLayout(int i) {
      if(i == n) {
        return done = true;
      }
  
      for(int j=0; j<n; j++) {
        if( col[j] | dPos[i+j] | dNeg[i-j+n-1] )
          if(!isQueen(i, j)) continue;

        if(!isFixed(i, j))
          putQueen(i, j);

        if( computeQueenLayout(i+1) )
          return done;

        if(!isFixed(i, j))
          takeQueen(i, j);
      }

      return false;
    }

    public void dispBoardAnswer() {
      StringBuilder buf = new StringBuilder();

      for (boolean[] row : board) {
        for (boolean v : row) {
          buf.append(v ? "Q" : ".");
        }
        buf.append("\n");
      }

      System.out.print(buf);
    }
    public void dispBoardDetail() {
      StringBuilder buf = new StringBuilder();

      for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
          if(!isFree(i, j))
            buf.append(board[i][j] ? " Q" : " +");
          else
            buf.append(" .");
        }
        buf.append("\n");
      }

      System.out.print(buf);
    }
  }
}
