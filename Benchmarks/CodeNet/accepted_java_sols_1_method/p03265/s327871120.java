import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2= sc.nextInt();
    int y2= sc.nextInt();

    int dx = x2-x1;
    int dy = y2-y1;
    int addx = -dy;
    int addy = dx;

    int x3 = x2+addx;
    int y3 = y2+addy;
    int x4 = x3-dx;
    int y4 = y3-dy;


    System.out.print(x3);
    System.out.print(" ");
    System.out.print(y3);
    System.out.print(" ");
    System.out.print(x4);
    System.out.print(" ");
    System.out.println(y4);
  }
}
