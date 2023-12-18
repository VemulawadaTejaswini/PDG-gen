import java.util.Scanner;

class Point{
  double x, y;
  Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  void printPoint(){
    System.out.println(this.x + " " + this.y);
  }
}

class Main{
  static final double sin60 = Math.sin(Math.toRadians(60));
  static final double cos60 = Math.cos(Math.toRadians(60));

  static void koch(Point p1, Point p2, int n){
    if(n == 0)
      return;
    else{
      //find point of s, t, u
      Point s = new Point((2*p1.x+p2.x)/3, (2*p1.y+p2.y)/3);
      Point t = new Point((p1.x+2*p2.x)/3, (p1.y+2*p2.y)/3);
      Point u = new Point((t.x-s.x)*cos60-(t.y-s.y)*sin60+s.x,
                          (t.x-s.x)*sin60+(t.y-s.y)*cos60+s.y);
      koch(p1, s, n - 1);
      s.printPoint();
      koch(s, u, n - 1);
      u.printPoint();
      koch(u, t, n - 1);
      t.printPoint();
      koch(t, p2, n - 1);
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    Point p1 = new Point(0, 0);
    Point p2 = new Point(100, 0);

    p1.printPoint();
    koch(p1, p2, n);
    p2.printPoint();
  }
}