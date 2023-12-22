import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int ar[]= new int[5];
    for(int i=0;i<5;i++)
    {
      ar[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++)
    {
      if(ar[i]==0)
      {
        System.out.println(i+1);
        break;
      }
    }
  }
}