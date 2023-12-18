import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x1 = Integer.parseInt(sc.next());
    int y1 = Integer.parseInt(sc.next());
    int x2 = Integer.parseInt(sc.next());
    int y2 = Integer.parseInt(sc.next());
    
    int vectorX = x2 - x1;
    int vectorY = y2 - y1;
    
    int tmp = vectorX;
    vectorX = -1 * vectorY;
    vectorY = tmp;
    
    int x3 = x2 + vectorX;
    int y3 = y2 + vectorY;
    
    tmp = vectorX;
    vectorX = -1 * vectorY;
    vectorY = tmp;
    
    int x4 = x3 + vectorX;
    int y4 = y3 + vectorY;
    
    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    
  }
}