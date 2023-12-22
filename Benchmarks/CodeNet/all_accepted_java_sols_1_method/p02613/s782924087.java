
import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */



public class Main
{
     
     
     
   
    
public static void main (String[] args) throws java.lang.Exception
{Scanner scn = new Scanner(System.in) ;
  int n = scn.nextInt() ;
 int a = 0 ; int t = 0 ; int r= 0 ; int w =  0;
 for(int k = 1; k <= n ; k++ )
 {
   String str =  scn.next() ;
   
   if(str.equals("AC"))
      {
        a++ ;
      }
   else if(str.equals("WA"))
      {
        w++ ;
      }
      else if(str.equals("TLE"))
      {
        t++ ;
      }
        
      else         
      {
        r++ ;
      }
   
 }
 
 System.out.println("AC x " + a ) ;
System.out.println("WA x " + w) ;
System.out.println("TLE x " + t) ; 
System.out.println("RE x " + r) ;
              
              
}
}




              
             