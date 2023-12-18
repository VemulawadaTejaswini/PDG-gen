import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.print(n+":");
    for(int i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      { 
        while(n%i==0)
        {
          System.out.print(" "+i);
          n=n/i;
        }
      }
    }
    
     if(n!=1)
       System.out.print(" "+n);
       System.out.println();
        
  }

}
