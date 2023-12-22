import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner S = new Scanner(System.in);
      int time= S.nextInt();
      int h = time/ 3600;
      int m = (time - h*3600)/60;
      int s =  time % 60;
      System.out.printf("%d:%d:%d\n", h,m,s);
      }
 }
