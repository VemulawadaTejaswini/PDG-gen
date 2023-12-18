import java.util.*;
class Main 
{
 public static void main(String[] a)
  {
   int c1,c2,c3,r;
   for(c1=1,c2=10;c1<=c2;c1++)
   {
    for(c3=1;c3<=c2;c3++)
    {
     r=c1*c3;
     System.out.println(c1+"x"+c3+"="+r);
    }
   }
  }
}