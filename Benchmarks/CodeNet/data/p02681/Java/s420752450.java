import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
  	Scanner sc= new Scanner(System.in);
    String S= sc.nextLine();
    String T= sc.nextLine();
    if(S.length()+1==T.length()&& S.equals(T.substring(0,( S.length()-1))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  
}


