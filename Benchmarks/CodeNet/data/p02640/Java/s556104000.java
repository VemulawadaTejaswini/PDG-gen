import java.util.*;
public class main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    int j=sc.nextInt();
    int flag=0;
    for(int k=1;k<=j;k++)
    {
      if((k*2+(i-k)*4)==8)||(k*4+(i-k)*2)==8)
      {
        System.out.println("Yes");
        flag=1;
      }  
    }
    if(flag==0)
    {
      System.out.println("No");
    }
  }
}  