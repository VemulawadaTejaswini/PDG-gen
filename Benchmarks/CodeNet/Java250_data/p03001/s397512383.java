import java.util.*;
class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int w = Integer.parseInt(sc.next());
      int h = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      
      double half = (double)w*h / 2; 
      
      double centerX = (double)w / 2;
      double centerY = (double)h / 2;
      
      
      
      if (x == centerX && y == centerY) {
        System.out.print(half);
        System.out.print(' ');
        System.out.print(1);
      } else {
        System.out.println(half);
        System.out.print(' ');
        System.out.print(0);
      }
    }
      
}