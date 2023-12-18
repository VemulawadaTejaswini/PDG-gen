import java.util.Scanner;

public class Main {
   public static void main(String args[]){
      Scanner keyboard = new Scanner(System.in);
      int x = keyboard.nextInt();
      int y, h, m, s;
      s = x % 60;
      x = x - s;
      y = x / 60;
      m = y % 60;
      y = y - m;
      h = y / 60;
      System.out.print(h);
      System.out.print(":");
      System.out.print(m);
      System.out.print(":");
      System.out.println(s);
   }
}
