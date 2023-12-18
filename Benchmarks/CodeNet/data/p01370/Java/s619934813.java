import java.util.Scanner;

import java.util.HashSet;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int turn = scan.nextInt();
    int object = scan.nextInt();

    while(!(turn==0&&object==0)) {
      HashSet<Point> canMove = new HashSet<>();
      HashSet<Point> nextMove = new HashSet<>();
      HashSet<Point> objects = new HashSet<>();

      for(int i = 0; i < object; i++) {
        Point dummyP = new Point(scan.nextInt(),scan.nextInt());
        objects.add(dummyP);
      }

      Point startP = new Point(scan.nextInt(),scan.nextInt());
      canMove.add(startP);
      nextMove.add(startP);

      for(int i = 0; i < turn; i++) {
        HashSet<Point> dummyMove = new HashSet<>();
        for(Point _p : nextMove) {
          Point[] parr = new Point[6];
          parr[0] = new Point(_p.x+1,_p.y);
          parr[1] = new Point(_p.x,_p.y+1);
          parr[2] = new Point(_p.x+1,_p.y+1);
          parr[3] = new Point(_p.x-1,_p.y);
          parr[4] = new Point(_p.x,_p.y-1);
          parr[5] = new Point(_p.x-1,_p.y-1);

          for(Point _pa : parr) {
            if(!canMove.contains(_pa)&&!objects.contains(_pa)) {
              //System.out.println(_pa);
              dummyMove.add(_pa);
              canMove.add(_pa);
            }
          }
        }
        if(dummyMove.size()<=0) break;

        nextMove = dummyMove;
      }

      System.out.println(canMove.size());

      turn = scan.nextInt();
      object = scan.nextInt();
    }
  }
}

class Point{
  int x,y;
  Point(int _x, int _y) {
    x = _x;
    y = _y;
  }

  @Override
  public String toString() {
    return "("+x+","+y+")";
  }

  @Override
  public int hashCode() {
    return x*10000+y;
  }

  @Override
  public boolean equals(Object obj) {
    if(x==((Point)obj).x&&y==((Point)obj).y) return true;
    return false;
  }
}