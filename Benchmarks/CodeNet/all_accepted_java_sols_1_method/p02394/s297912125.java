import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] input = sc.nextLine().split(" ");
      
      int W = Integer.parseInt(input[0]);
      int H = Integer.parseInt(input[1]);
      int x = Integer.parseInt(input[2]);
      int y = Integer.parseInt(input[3]);
      int r = Integer.parseInt(input[4]);
      
      
      if ( 2 * r > H && 2 * r > W) {
         //if the rectangle is too small
         System.out.println("No");
      } else if ( x < r || W - r < x) {
         //if the circle is out horizontally
         System.out.println("No");
      } else if ( y < r || H - r < y) {
         //if the circle is out vertically
         System.out.println("No");
      } else {
         //else
         System.out.println("Yes");
      }
      
      
      
   }
}
