import java.util.Scanner;


public class Main {
	
       public static void main(String[] args) {
    	  Scanner input=new Scanner( System.in);
    	  
    	  String string=input.next();
    	  int len=string.length();
    	  int ans=0;
    	  for(int i=0;i<len;i++)
    	  {
    		  if(i%2==0)
    		  {
    			  if(string.charAt(i)=='p')
    				  ans--;
    		  }
    		  else
    		  {
    			  if(string.charAt(i)=='g')
    				  ans++;
    		  }
    	  }
    	  System.out.println(ans);
          
	}
}
