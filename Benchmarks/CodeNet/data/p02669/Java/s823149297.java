import java.util.Scanner;

public class Main {

  static String ans = "No";
  static int H = 0;
  static int W = 0;
  static char[][] maze;
  static boolean[][] reached;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();

    maze = new char[H][W];
    reached = new boolean[H][W];
    int[] start = new int[2];

    for (int i = 0; i < H; i++){
      String s = sc.next();
      for ( int j = 0; j < W; j++){
        maze[i][j] = s.charAt(j);
        if ( 's' == maze[i][j]){
          start[0] = i;
          start[1] = j;
        }

      }
    }

    solve(start[0],start[1], maze);

    System.out.println(ans);

  }

  private static void solve(int y, int x, char[][] maze) {

    if ( y < 0 || y >= H || x < 0 || x >= W || maze[y][x] == '#') return;
    if ( reached[y][x] ) return;
    if (maze[y][x] == 'g'){ ans = "Yes"; return; }

    reached[y][x] = true;

    solve(y+1, x, maze);
    solve(y-1, x, maze);
    solve(y, x-1, maze);
    solve(y, x+1, maze);

    return;

  }

}