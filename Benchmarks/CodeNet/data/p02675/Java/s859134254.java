/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{ 
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);
    static StringTokenizer st;
    
    static String next()
        {
            while(st==null || !st.hasMoreElements()) 
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   static int gcd(int a,int b)
     {
       if(b==0)
        return a;
       else
        return gcd(b,a%b);
     }
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	   
		 
		       int n=Integer.parseInt(next());
		       String a="hon";
		       String b="pon";
		       String c="bon";
		       String tot="";
		             int d=n%10;
		             switch(d)
		               {
		                  case 0 :
		                     tot=b;
		                     break;
		                   case 1: 
                             tot=b;
                            break; 
                         case 2: 
                            tot=a;
                          break; 
                         case 3: 
                          tot=c;
                            break; 
                         case 4: 
                          tot=a;
                         break; 
                         case 5: 
                             tot=a;
                            break; 
                         case 6: 
                            tot=b;
                          break; 
                            case 7: 
                          tot=a;
                           break; 
                        case 8: 
                        tot=b;
                        break; 
                      case 9: 
                       tot=a;
                       break;
		               
		          }
		      System.out.println(tot);
		    
	   }     
	catch(Exception e)
		 {}
	}
}
