import java.util.*;
public class Main{
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
   int a=sp.nextInt();
    int b=sp.nextInt();
    int l=0;
     int n=0;
    if(a<b)
    {
        l=b;
    }
    else
    {
        l=a;
    }
   for(int k=0;k<l;k++)
   {
      if(Math.abs(a-k)==Math.abs(b-k))
       {
           n=k;
       }
      
   }
   if(!(n==0))
   {
       System.out.println(n);
   }
   else{
       System.out.println("IMPOSSIBLE");
   }
   
   

}
}
