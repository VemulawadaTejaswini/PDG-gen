import java.util.Scanner;


public class Main {
	
       public static void main(String[] args) {
    	  Scanner input=new Scanner( System.in);
    	  
    	  String string=input.next();
    	  int len=string.length();
    	  int ans=0;
    	  for(int i=0;i<=(len+1)/2-1;i++)
    	  {
    		  if(string.charAt(i)=='p')
    		  {
    			  ans--;
    		  }
    	  }
    	  for(int i=(len+1)/2;i<len;i++)
    	  {
    		  if(string.charAt(i)=='g')
    		  {
    			  ans++;
    		  }
    	  }
    	  System.out.println(ans);
          
	}
}
