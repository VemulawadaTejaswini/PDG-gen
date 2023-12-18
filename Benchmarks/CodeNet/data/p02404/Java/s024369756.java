import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void draw(int a, int b)
  {
    for(int j=0; j<b; j++) System.out.print("#");
    System.out.println();
    for(int i=1; i<a-1; i++)
    {
      System.out.print("#");
      for (int j = 1; j < b-1; j++) {
        System.out.print(".");
      }
      System.out.println("#");
    }
    for(int j=0; j<b; j++) System.out.print("#");
    System.out.println();
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    while(true)
    {
      int a = scan.nextInt();
      int b = scan.nextInt();
      if(a ==0 && b == 0) break;
      draw(a,b);
      System.out.println();
    }
    scan.close();
  }
}

