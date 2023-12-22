import java.util.Scanner;


public class Main
{
   public static void main(String[] args)
   {
     Scanner in=new Scanner(System.in);
     int t,s,m,h;
     t=in.nextInt();
     h=t/3600;
     m=(t%3600)/60;
     s=t%60;
     System.out.println(h+":"+m+":"+s);
      
   }

}