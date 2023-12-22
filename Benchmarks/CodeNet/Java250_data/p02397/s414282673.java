import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
  		Scanner in = new Scanner(System.in);

		for(int i = 1; i > 0; i++){

	      	String X,Y;
	  		int x,y;
	
			X = in.next();
	  		Y = in.next();
			x = Integer.parseInt(X);
	  		y = Integer.parseInt(Y);
	
	      	if(x == 0 && y == 0){
	        	break;
	      	}else{
		  		if(x >= y){
		  			System.out.println(y + " " + x);
		  		}else{
		  			System.out.println(x + " " + y);
		  		}
      		}
    	}
	}
}