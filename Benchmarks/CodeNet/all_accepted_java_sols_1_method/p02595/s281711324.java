import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
    Scanner sc=new Scanner(System.in);
    
	
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    long count=0;
		  for(int i=0;i<n;i++){
		      int x=sc.nextInt();
		      int y=sc.nextInt();
		      double ans = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		      if(ans<=d){
		          count+=1;
		      }
		  }
		  System.out.println(count);
		
    }
}