import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
  		Scanner in = new Scanner(System.in);

		for(int i = 1; i > 0; i++){

	      	String X;
	  		int x;
	
	  		X = in.nextLine();
	  		x = Integer.parseInt(X);
	
	      	if(x == 0){
	        	break;
	      	}else{
		  		System.out.println("Case " + i + ": " + x);
      		}
    	}
	}
}