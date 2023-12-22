import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    for(int j=0;j<5;j++)
    {
      int val=sc.nextInt();
      if(val==0)
      {
        System.out.println(j+1);
        break;
      }
    }
  }
}