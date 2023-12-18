import java.util.*;
import java.lang.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);

		int n;
		n=sc.nextInt();
		
		if(n%10 == 3)
        {
          System.out.println("bon");
        }
     else if((n%10 ==0)||(n%10 ==1)||(n%10 ==6)||(n%10 ==8))
     {
       System.out.println("pon");
     }
      else{
         System.out.println("hon");
      }}}
       
