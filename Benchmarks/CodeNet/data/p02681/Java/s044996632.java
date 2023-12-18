import java.util.*;

class Main{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    String S=s.next();
    String T=s.next();
    if((T.length()-S.length())==1)
    {
      if(S.length()>=1 and S.length()<=10)
      {
        System.out.println("Yes");
      }
    }
    else
      
        System.out.println("No");
      
  }
}