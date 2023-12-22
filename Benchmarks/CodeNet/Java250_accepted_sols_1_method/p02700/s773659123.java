import java.util.*;
class Main
{
  public static void main(String [] args)
  {
  Scanner sc=new Scanner(System.in);
  int A=sc.nextInt();
  int B=sc.nextInt();
  int C=sc.nextInt();
  int D=sc.nextInt();
  boolean flag=true;
  while(flag)
  {
        if(A>0)
        C=C-B;
        if(D>0)
        A=A-D;
    
   if(C<=0)
   {
       System.out.println("Yes");
       flag=false;
   }
    else if(A<=0)
    {
        System.out.println("No");
        flag=false;
    }
  }
    
}
}
