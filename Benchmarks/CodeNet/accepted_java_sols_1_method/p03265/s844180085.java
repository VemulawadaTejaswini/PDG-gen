import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int x1 = Integer.parseInt(sc.next());
    int y1 = Integer.parseInt(sc.next());
    int x2 = Integer.parseInt(sc.next());
    int y2 = Integer.parseInt(sc.next());
    
    int sx = x2-x1;
    int sy = y2-y1;
    
    int x3 = x2-sy;
    int y3 = y2+sx;
    int x4 = x1-sy;
    int y4 = y1+sx;
    
    System.out.println(x3+" "+y3+" "+x4+" "+y4);
  }
}