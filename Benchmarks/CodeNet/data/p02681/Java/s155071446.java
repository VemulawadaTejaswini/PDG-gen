import java.util.Scanner;

public class DP
{
    public static void main(String args[]) {
      Scanner sc  = new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
      if(b.length()<=a.length())
      {
          System.out.println("No");
      }
      else if((b.length()-1)==(a.length()))
      {
          System.out.println("Yes");
      }
    }





}