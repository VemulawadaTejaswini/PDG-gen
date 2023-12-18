import java.util.Scanner;

class Main
{
   public static void main(String[] args)
   {
      int n,hh,mm,ss;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      hh = n/3600;
      mm = (n/60)%60;
      ss = n%60;
      System.out.println( hh + ":" + mm + ":" + ss );
   }
}
