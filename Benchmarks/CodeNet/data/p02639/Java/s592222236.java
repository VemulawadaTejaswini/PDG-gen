import java.util.*;
class searchzero
{
  public static void main(String args[])throws Exception
  {
    Scanner in=new Scanner(System.in);
    int x[]=new int[5];
    int i;
    for(i=0;i<5;i++)
    x[i]=in.nextint();
    for(i=0;i<5;i++)
    {
      if(x[i]==0)
      {
        break;
      }
    }
    System.out.println(i+1);
  }
}
    
