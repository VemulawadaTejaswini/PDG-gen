import java.util.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    try {
    Scanner sc=new Scanner(System.in);
    int x[]=new int[5];
    int i;
    for(i=0;i<5;i++)
    x[i]=sc.nextInt();
    for(i=0;i<5;i++)
    {
      if(x[i]==0)
      {
        break;
      }
    }
    System.out.println(i+1);
    } catch(Exception e) { return;
                         } finally {
    }
  }
}
    
