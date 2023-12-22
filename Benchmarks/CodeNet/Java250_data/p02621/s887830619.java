import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */



public class Main
{
     
     
     static int mod(int a, int m) 
{ 
    return (a%m + m) % m; 
}
   
    
public static void main (String[] args) throws java.lang.Exception
{Scanner scn = new Scanner(System.in) ;

int n = scn.nextInt() ;

int ans  = (n) + (n *n) + (n*n*n) ;

System.out.println(ans) ;

              
}
}




              
             