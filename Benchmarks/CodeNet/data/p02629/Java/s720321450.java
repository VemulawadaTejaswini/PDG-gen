import java.util.*;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    
	      long n = scan.nextLong();
	      StringBuilder s = new StringBuilder();
	      
	      while(n > 0) 
	      {
	    	char j = (char)(n % 26 + 96);
	    	if(n%26 == 0) {
	    		j = 122;
	    		n -= 26;
	    	}
	    	s.append(j);
	        n /= 26;
	      }
	      	
	      for(int i=s.length()-1; i>=0; i--) 
	      {
	    	  System.out.print(s.charAt(i));
	      }
      
    }
}