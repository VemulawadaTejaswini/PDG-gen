import java.util.*;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    char[] c=sc.next().toCharArray();
    int sum=0;
    for(int i=0;i<4;i++)
    {
      if(c[i]=='+')
      {
        sum++;
      }
      else
      {
        sum--;
      }
    }
    System.out.println(sum);
  }
}