import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
        Scanner ab = new Scanner(System.in);
        
		 while( ab.hasNext())
		 {
			 long n,x,y,a,b,c,p;
			 
			 a = ab.nextLong();
			 
			 x = a;
			 
			 b = ab.nextLong();
			 
			 y = b;
			 
			 
			 while( a!=0 )
			 {
			        c = a;
			        a = b % a;
			        b = c;
			 }
			 
			 p = (x*y)/b;
			 
			 System.out.printf("%d ",b);
			
			 System.out.println( p );
		 }
        
        
    }
}

       