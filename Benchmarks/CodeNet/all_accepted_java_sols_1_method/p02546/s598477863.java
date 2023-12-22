import java.util.*;
class Main
{
  public static void main(String args[])
    {
    String S;
    Scanner sc= new Scanner(System.in);
    S=sc.nextLine();
    if(S.charAt(S.length()-1)=='s')
      System.out.println(S+"es");
    else
      System.out.println(S+"s");
  }
}