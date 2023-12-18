import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner S = new Scanner(System.in);
      int h = S/3600;
      int m = (S-3600*h)/60;
      int s = S % 3600;
      System.out.printf("%d %d %d\n" h,m,s)
      }
 }

