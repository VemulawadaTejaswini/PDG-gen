import java.util.Scanner;
public class Main
{
  public static void main(String[] args) throws Exception
  {
	Scanner sc= new Scanner(System.in);
	 String S= sc.next();
   	 String T= sc.next();
  	  if(S.length()+1==T.length() && S.equals(T.substring(0,S.length())))
  	    System.out.println("Yes");
 	   else
 	     System.out.println("No");

}
 
  
}


