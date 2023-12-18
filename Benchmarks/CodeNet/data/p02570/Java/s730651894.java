import java.util.*;
import java.lang.*;
import java.io.*;
public class atcoder {

	public static void main(String args[]) 
	  {
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    while(test-->0){
	      int d = s.nextInt();
	      int t = s.nextInt();
	      int sp = s.nextInt();
	      
	      int calc = d/sp;
	      
	      if(calc<t){
	        System.out.println("yes");
	      }
	      if(calc>t){
	        System.out.println("no");
	      }
	        
	        
	      }
	  }
}
