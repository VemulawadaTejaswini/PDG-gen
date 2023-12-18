import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int K=sc.nextInt();
    String S=sc.nextLine();
    if(S.length<=K)
    {
      System.out.println("S");
    }
    else
    {
      String str=S.substring(K);
      str.append("...");
      System.out.println("str");
    }
  }
}
