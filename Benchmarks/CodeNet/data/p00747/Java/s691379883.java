import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


class Maze {
  private int width;
  private int height;
  private int px;
  private int py;
  private int length;
  private Cell[][] cells;
  private boolean[][] is_passed_through;

  static Cell[][] getInitialCells(int width, int height) {
    Cell[][] _cells = new Cell[height][width];
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        _cells[y][x] = new Cell();
      }
    }
    return _cells;
  }

  static boolean[][] getInitialIsPassedThrough(int width, int height) {
    boolean[][] _is_passed_through = new boolean[height][width];
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        _is_passed_through[y][x] = false;
      }
    }
    _is_passed_through[0][0] = true;
    return _is_passed_through;
  }

  Maze(int _width, int _height) {
    this(_width, _height, 0, 0, 1, getInitialCells(_width, _height), getInitialIsPassedThrough(_width, _height));
  }

  private Maze(int _width, int _height, int _px, int _py, int _length, Cell[][] _cells, boolean[][] _is_passed_through) {
    width  = _width;
    height = _height;
    px     = _px;
    py     = _py;
    length = _length;
    cells  = _cells;
    is_passed_through = _is_passed_through;
  }

  private Maze dupuricate() {
    // boolean[][] _is_passed_through = new boolean[height][width];
    // for(int y = 0; y < height; y++) {
    //   for(int x = 0; x < width; x++) {
    //     _is_passed_through[y][x] = isPassedThrough(x, y);
    //   }
    // }
    return new Maze(width, height, px, py, length, cells, is_passed_through);
  }

  public void setWallAround() {
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < width; x++) {
        if(x == 0)          { cell(x, y).setLeft();   }
        if(x == width - 1)  { cell(x, y).setRight();  }
        if(y == 0)          { cell(x, y).setTop();    }
        if(y == height - 1) { cell(x, y).setBottom(); }
      }
    }
  }

  public void setWall(int p, int q, int isWall) {
    if(isWall == 0) {
      return;
    }

    int y = p / 2;
    int x = q;

    // vertical wall
    if(p % 2 == 0) {
      cell(x,     y).setRight();
      cell(x + 1, y).setLeft();
    }

    // horizontal wall
    else {
      cell(x, y    ).setBottom();
      cell(x, y + 1).setTop();
    }
  }

  public int getLength() {
    return length;
  }

  private Cell cell(int x, int y) {
    return cells[y][x];
  }

  private boolean isPassedThrough(int x, int y) {
    return is_passed_through[y][x];
  }

  private void passThrough() {
    is_passed_through[py][px] = true;
  }

  public Maze moveTop() {
    Maze dupuricated = dupuricate();
    dupuricated.py--;
    dupuricated.length++;
    dupuricated.passThrough();
    return dupuricated;
  }
  public Maze moveRight() {
    Maze dupuricated = dupuricate();
    dupuricated.px++;
    dupuricated.length++;
    dupuricated.passThrough();
    return dupuricated;
  }
  public Maze moveBottom() {
    Maze dupuricated = dupuricate();
    dupuricated.py++;
    dupuricated.length++;
    dupuricated.passThrough();
    return dupuricated;
  }
  public Maze moveLeft() {
    Maze dupuricated = dupuricate();
    dupuricated.px--;
    dupuricated.length++;
    dupuricated.passThrough();
    return dupuricated;
  }

  public boolean ableToGoTop() {
    return cell(px, py).ableToGoTop() && !isPassedThrough(px, py - 1);
  }
  public boolean ableToGoRight() {
    return cell(px, py).ableToGoRight() && !isPassedThrough(px + 1, py);
  }
  public boolean ableToGoBottom() {
    return cell(px, py).ableToGoBottom() && !isPassedThrough(px, py + 1);
  }
  public boolean ableToGoLeft() {
    return cell(px, py).ableToGoLeft() && !isPassedThrough(px - 1, py);
  }

  public boolean isFinished() {
    return px == width - 1 && py == height - 1;
  }

  public String debugString() {
    String debug = "";
    debug += "width = " + width + ", ";
    debug += "height = " + height + ", ";
    debug += "px = " + px + ", ";
    debug += "py = " + py + ", ";
    debug += "length = " + length;
    // debug += "\n";
    // for(int y = 0; y < height; y++) {
    //   for(int x = 0; x < width; x++) {
    //     debug += "cell(" + x + ", " + y + ") = " + cell(x, y).debugString() + "\n";
    //   }
    // }
    return debug;
  }
}

class Cell {
  private boolean top;
  private boolean right;
  private boolean bottom;
  private boolean left;

  Cell() {
    top    = true;
    right  = true;
    bottom = true;
    left   = true;
  }

  public void setTop()    { top    = false; }
  public void setRight()  { right  = false; }
  public void setBottom() { bottom = false; }
  public void setLeft()   { left   = false; }

  public boolean ableToGoTop()    { return top;    }
  public boolean ableToGoRight()  { return right;  }
  public boolean ableToGoBottom() { return bottom; }
  public boolean ableToGoLeft()   { return left;   }

  public String debugString() {
    return "top = " + (top ? "X" : " ") + ", right = " + (right ? "X" : " ") + ", bottom = " + (bottom ? "X" : " ") + ", left = " + (left ? "X" : " ") + ",";
  }
}

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int width = sc.nextInt();
      int height = sc.nextInt();
      if(width == 0 && height == 0) {
        break;
      }

      // input wall data
      Maze maze = new Maze(width, height);
      maze.setWallAround();
      for(int i = 0; i < height * 2 - 1; i++) {
        for(int j = 0; j < width; j++) {
          if(i % 2 == 0 && j == width - 1) {
            continue;
          }
          maze.setWall(i, j, sc.nextInt());
        }
      }

      // do breadth first search
      int min = 0;
      Queue<Maze> queue = new ArrayDeque<Maze>();
      queue.add(maze);
      while(!queue.isEmpty()) {
        Maze current = queue.remove();

        if(current.isFinished()) {
          min = current.getLength();
          break;
        }

        if(current.ableToGoTop())    { queue.add(current.moveTop());    }
        if(current.ableToGoRight())  { queue.add(current.moveRight());  }
        if(current.ableToGoBottom()) { queue.add(current.moveBottom()); }
        if(current.ableToGoLeft())   { queue.add(current.moveLeft());   }
      }

      System.out.println(min);
    }
  }
}