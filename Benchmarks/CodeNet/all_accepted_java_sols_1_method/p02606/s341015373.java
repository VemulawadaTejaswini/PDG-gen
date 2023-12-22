import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int l=in.nextInt();
    int d=in.nextInt();
    int c=0;
   for(int i=r;i<=l;i++)
   {
	   if(i%d==0)
	   {
		   c++;
	   }
   }
   System.out.println(c);
  }
}