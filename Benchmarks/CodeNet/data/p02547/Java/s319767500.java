import java.util.Scanner;
import java.lang.*;
public class Main {
 public static void main( String args[] )    
    {
        // create Scanner to obtain input from command window       
        Scanner input = new Scanner(System.in);
        
        int n;         
        n = input.nextInt(); 
        int flag=0;
  		for(int i=0;i<n;i++)
        {
          int n1=input.nextInt();
          int n2=input.nextInt();
          
          if(n1==n2)
          {  if(i+2<n-1)
              continue;
            int n2=input.nextInt();
             int n2=input.nextInt();
             if(n2== n2)
             {int n3=input.nextInt();
              int n3=input.nextInt();
              if(n3==n3)
              {flag=5;
              }
             }
          }
        }
   if(flag==5)
     System.out.println("Yes")
     else
       System.out.println("No");
 }